package cn.tjut.juc.threadLocal;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.*;
import java.util.logging.SimpleFormatter;

public class demo01 {
    private final static ThreadPoolExecutor  EXECUTOR = new ThreadPoolExecutor(17, 20, 60, TimeUnit.SECONDS,
            new ArrayBlockingQueue<>(1000), Executors.defaultThreadFactory(), new ThreadPoolExecutor.AbortPolicy());
    private final static  SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    public static void main(String[] args) {
        for (int i = 0; i < 1000; i++) {
            int finali = i; // 递增的时间戳， 间隔 1s;
            EXECUTOR.execute(() -> {
                System.out.println(simpleDateFormat.format(new Date(finali * 1000))); // 代表从1970... 经过的毫秒时间戳
            });
        }
    }
}
