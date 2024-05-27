package cn.tjut.juc.ConcurrentHashMap;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Supplier;
import java.util.stream.Collectors;

/**
 * 生成测试数据
 */
public class demo01 {
    // 字母表
    static final String ALPHA = "abcedfghijklmnopqrstuvwxyz";

    // 主方法
    public static void main(String[] args) {
        // 初始化字母表的长度
        int length = ALPHA.length();
        // 初始化每个字母出现的次数
        int count = 200;
        // 创建存储字母列表的集合
        List<String> list = new ArrayList<>(length * count);
        // 生成一定数量的每个字母
        for (int i = 0; i < length; i++) {
            char ch = ALPHA.charAt(i);
            for (int j = 0; j < count; j++) {
                list.add(String.valueOf(ch));
            }
        }
        Collections.shuffle(list); // 打乱列表
        // 将字母列表按每个字母存储到不同的文件中
        for (int i = 0; i < 26; i++) {
            try (PrintWriter out = new PrintWriter(
                    new OutputStreamWriter(
                            new FileOutputStream("tmp/" + (i+1) + ".txt")))) {
                // 将列表中一定范围内的元素按行输出到文件中
                String collect = list.subList(i * count, (i + 1) * count).stream()
                        .collect(Collectors.joining("\n"));
                out.print(collect);
            } catch (IOException e) {
            }
        }
    }
}

