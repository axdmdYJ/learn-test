package cn.tjut.juc.threadpool;


import java.util.concurrent.*;

class MyCallable implements Callable<String>{

    private int n;
    public MyCallable(int n){
        this.n = n;
    }
    @Override
    public String call() throws Exception {
        return n + "是" + n;
    }
}
public class test03 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(
                3,
                5,
                8,
                TimeUnit.SECONDS,
                new ArrayBlockingQueue<>(3),
                Executors.defaultThreadFactory(),
                new ThreadPoolExecutor.AbortPolicy()
        );
        Future<String> submit = threadPoolExecutor.submit(new MyCallable(100));
        System.out.println(submit.get());
    }
}
