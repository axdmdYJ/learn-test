package cn.tjut.juc.CAS;

import java.util.concurrent.atomic.AtomicInteger;

class AccountSafe implements Account{

    AtomicInteger atomicInteger ;
    
    public AccountSafe(Integer balance){
        this.atomicInteger =  new AtomicInteger(balance);
    }
    
    @Override
    public Integer getBalance() {
        return atomicInteger.get();
    }

    @Override
    public void withdraw(Integer amount) {
        // 核心代码，有助于理解CAS
        //while 循环内部 prev 和 next 在 cpu 高速缓存中，因为需要频繁读写
        while (true){
            //获取余额最新值
            int pre = getBalance();
            //要修改的余额
            int next = pre - amount;
             /*
            compareAndSet 正是做这个检查，在 set 前，先比较 prev 与当前值
                - 不一致了，next 作废，返回 false 表示失败
                比如，别的线程已经做了减法，当前值已经被减成了 990
                那么本线程的这次 990 就作废了，进入 while 下次循环重试
                - 一致，以 next 设置为新值，返回 true 表示成功
            */
            if (atomicInteger.compareAndSet(pre,next)){
                break;
            }
        }
    }
}