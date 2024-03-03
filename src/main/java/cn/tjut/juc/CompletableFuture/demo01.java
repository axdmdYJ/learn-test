package cn.tjut.juc.CompletableFuture;

import java.util.concurrent.FutureTask;

public class demo01 {
    public static void main(String[] args) throws Exception {
        FutureTask<String> futureTask = new FutureTask<>(() ->
                Thread.currentThread().getName() + "-竹子爱熊猫......");
        new Thread(futureTask, "T1").start();

        // 可以在这里先完成别的工作，因为任务执行需要时间

        // 最后再获取执行结果
        System.out.println("main线程获取异步执行结果："
                + futureTask.get());
    }


}
