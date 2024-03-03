package cn.tjut.juc.scene;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class ParallelCalculation {

    private static final int NTHREADS = 4;
    private static final ExecutorService exec = Executors.newFixedThreadPool(NTHREADS);

    public static void main(String[] args) {
        Callable<Double> task = new Callable<Double>() {
            @Override
            public Double call() {
                // 这里模拟一些数值计算
                return Math.random() * 100;
            }
        };

        List<Future<Double>> results = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            results.add(exec.submit(task));
        }

        for (Future<Double> result : results) {
            try {
                System.out.println(result.get());
            } catch (InterruptedException | ExecutionException e) {
                e.printStackTrace();
            }
        }

        exec.shutdown();
    }
}