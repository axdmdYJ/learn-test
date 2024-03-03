package cn.tjut.juc.scene;

import java.util.concurrent.*;

public class SimpleWebServer {
    private static final int CPU_COUNT = Runtime.getRuntime().availableProcessors();
    private static final int CORE_POOL_SIZE = 2 * CPU_COUNT;
    private static final int MAX_POOL_SIZE = 2 * CPU_COUNT + 1;

    private static final ThreadPoolExecutor exec = new ThreadPoolExecutor(
            CORE_POOL_SIZE,
            MAX_POOL_SIZE,
            60L,
            TimeUnit.SECONDS,
            new LinkedBlockingQueue<>(1000)
    );

    public static void main(String[] args) {
        while (true) {
            Runnable request = () -> System.out.println("Request handled by " + Thread.currentThread().getName());

            exec.execute(request);
        }
    }
}
