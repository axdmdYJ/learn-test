package cn.tjut.juc.distinction;

public class Test07 {
    public static void main(String[] args) {
        // 创建线程对象
        Thread thread1 = new Thread(new MyRun07());

        // 顺便改个名字
        thread1.setName("t1");

        // 启动线程
        thread1.start();

        // 假设main主线程5秒钟做完了事，要求thread1线程醒来
        try {
            Thread.sleep(5 * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // 叫醒thread1线程，终止它的睡眠
        thread1.interrupt();

    }
}

class MyRun07 implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "--begin");

        // 让当前这个线程休眠1年，哈哈

        // 注意：这里的sleep()不能上抛异常，只能自己捕捉
        // 因为父类中的run()方法没有抛出任何异常，子类重写的方法不能抛出更多的异常
        try {
            Thread.sleep(1000L * 60 * 60 * 24 * 365);
        } catch (InterruptedException e) {
            System.out.println(Thread.currentThread().getName() + "：难道有人叫我？");
            e.printStackTrace();
        }

        System.out.println(Thread.currentThread().getName() + "--over");
    }
}
