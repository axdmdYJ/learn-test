package cn.tjut.j8;

import java.time.LocalDate;
import java.util.function.Supplier;

class p {
    private int height;
}
public class test10 {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        Supplier<Long> supplier1 = ()->{
            return System.currentTimeMillis();
        };

        System.out.println(supplier1.get());


        // 通过 方法引用 来实现
        Supplier<Long> supplier2 = System::currentTimeMillis;
        System.out.println(supplier2.get());

        Supplier<p> su3 = p::new;
    }
}
