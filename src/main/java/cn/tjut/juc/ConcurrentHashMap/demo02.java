package cn.tjut.juc.ConcurrentHashMap;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Supplier;

public class demo02 {
    // 一个通用的演示方法，接受供应商和消费者作为参数
    private static <V> void demo(Supplier<Map<String,V>> supplier,
                                 BiConsumer<Map<String,V>, List<String>> consumer) {
        // 创建一个计数器Map，由供应商提供
        Map<String, V> counterMap = supplier.get();
        List<Thread> ts = new ArrayList<>();
        // 循环创建线程
        for (int i = 1; i <= 26; i++) {
            int idx = i;
            // 每个线程读取一个文件，并进行处理
            Thread thread = new Thread(() -> {
                List<String> words = readFromFile(idx); // 从文件中读取单词列表
                consumer.accept(counterMap, words); // 调用消费者函数处理单词列表
            });
            ts.add(thread); // 将线程加入列表
        }
        // 启动所有线程
        ts.forEach(t->t.start());
        // 等待所有线程执行完成
        ts.forEach(t-> {
            try {
                t.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        // 打印结果
        System.out.println(counterMap);
    }

    // 从文件中读取单词列表
    public static List<String> readFromFile(int i) {
        ArrayList<String> words = new ArrayList<>();
        try (BufferedReader in = new BufferedReader(new InputStreamReader(new FileInputStream("tmp/"
                + i +".txt")))) {
            while(true) {
                String word = in.readLine();
                if(word == null) {
                    break;
                }
                words.add(word);
            }
            return words;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        demo(
                // 创建 map 集合
                // 创建 ConcurrentHashMap 对不对？
                () -> new HashMap<String, Integer>(),
                // 进行计数
                (map, words) -> {
                    for (String word : words) {
                        Integer counter = map.get(word);
                        int newValue = counter == null ? 1 : counter + 1;
                        map.put(word, newValue);
                    }
                }
        );
    }

}
