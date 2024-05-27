package cn.tjut.juc.CAS;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class Code_04_UnsafeTest {

    public static void main(String[] args) {
        Account acount = new AccountUnsafe(new AtomicInteger(1000));
        Account.demo(acount); 
    }

}
class AccountUnsafe implements Account {

    private AtomicInteger balance;

    public AccountUnsafe(AtomicInteger balance) {
        this.balance = balance;
    }

    @Override
    public Integer getBalance() {
        return this.balance.get();
    }

    @Override
    public void withdraw(Integer amount) {
//        synchronized (this) { // 加锁。
//        }
        balance.getAndAdd(-1 * amount);
    }
}

interface Account {

    // 获取金额的方法
    Integer getBalance();
    // 取款的方法
    void withdraw(Integer amount);


    static void demo(Account account) {
        List<Thread> list = new ArrayList<>();
        long start = System.nanoTime();
        for(int i = 0; i < 1000; i++) {
            list.add(new Thread(() -> {
                account.withdraw(10);
            }));
        }
        list.forEach(Thread::start);
        list.forEach(t -> {
            try {
                t.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        long end = System.nanoTime();
        System.out.println(account.getBalance()
                + " cost: " + (end-start)/1000_000 + " ms");
    }
}