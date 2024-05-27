package cn.tjut.j8;

import javax.swing.plaf.IconUIResource;
import java.util.function.Consumer;

public class ConsumerTest {

    public static void main(String[] args) {
        test(msg -> {
            System.out.println(msg + "-> 转换为小写：" + msg.toLowerCase());
        }, msg -> {
            System.out.println(msg + "-> 转换为大写: " + msg.toUpperCase());
        });


    }

    public static void test(Consumer<String> consumer1, Consumer<String> consumer2){
        consumer1.accept("Hello World");
        consumer2.accept("jijijfioaf");
        consumer1.andThen(consumer2).accept("HeLo");
    }

}