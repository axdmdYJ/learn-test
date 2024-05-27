package cn.tjut.juc.distinction;

public class WaitSleepCase {

    static final Object LOCK = new Object();

    public static void main(String[] args) throws InterruptedException {
        // 使用sleeping()演示sleep()方法
        sleeping();
    }

    // 演示不合法的wait()调用
    private static void illegalWait() throws InterruptedException {
        // 错误示例：没有在同步块中调用wait()
        LOCK.wait();
    }

    // 演示wait()方法的使用
    private static void waiting() throws InterruptedException {
        Thread t1 = new Thread(() -> {
            synchronized (LOCK) {
                try {
                    // 打印等待消息
                    System.out.println(Thread.currentThread().getName() + " waiting...");
                    // 在持有锁的情况下等待5秒，然后释放锁
                    LOCK.wait(5000L);
                } catch (InterruptedException e) {
                    // 捕捉InterruptedException异常
                    System.out.println(Thread.currentThread().getName() + " interrupted...");
                    e.printStackTrace();
                }
            }
        }, "t1");
        t1.start();

        // 主线程等待一段时间
        Thread.sleep(100);

        // 在同步块中打印消息
        synchronized (LOCK) {
            System.out.println(Thread.currentThread().getName() + " other...");
        }
    }

    // 演示sleep()方法的使用
    private static void sleeping() throws InterruptedException {
        Thread t1 = new Thread(() -> {
            synchronized (LOCK) {
                try {
                    // 打印睡眠消息
                    System.out.println(Thread.currentThread().getName() + " sleeping...");
                    // 在持有锁的情况下睡眠5秒，不释放锁
                    Thread.sleep(5000L);
                } catch (InterruptedException e) {
                    // 捕捉InterruptedException异常
                    System.out.println(Thread.currentThread().getName() + " interrupted...");
                    e.printStackTrace();
                }
            }
        }, "t1");
        t1.start();

        // 主线程等待一段时间
        Thread.sleep(100);

        // 在同步块中打印消息
        synchronized (LOCK) {
            System.out.println(Thread.currentThread().getName() + " other...");
        }
    }
}
