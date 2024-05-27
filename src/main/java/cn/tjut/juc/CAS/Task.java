package cn.tjut.juc.CAS;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Task implements Runnable {
    public static Lock lock = new ReentrantLock();
    public static int count = 0;

    @Override
    public void run() {
        for (int i = 0; i<10000;i++){
            lock.lock(); // 第一次获取锁
            lock.lock(); // 第二次获取锁
            try {
                count++; // 非原子性操作：存在线程安全问题
            } finally {
                lock.unlock(); // 第一次释放锁
                lock.unlock(); // 第二次释放锁
            }
        }
    }
    
    public static void main(String[] args) throws InterruptedException {
        Task task = new Task();
        Thread t1 = new Thread(task);
        Thread t2 = new Thread(task);
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(count);
        // 执行结果：20000
    }
}
