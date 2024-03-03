package cn.tjut.juc.scene;

import java.util.concurrent.*;

/**
 * 异步任务处理
 */
public class AsynchronousTaskProcessor {

    private static final ExecutorService exec = Executors.newCachedThreadPool();

    public static void main(String[] args) {
        exec.execute(() -> {
            // 执行某些异步任务
            System.out.println("Async task started");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Async task completed");
        });

        System.out.println("rumen_01 thread continues to execute other operations.");
        exec.shutdown();
        System.out.println(Runtime.getRuntime().availableProcessors());
    }
}