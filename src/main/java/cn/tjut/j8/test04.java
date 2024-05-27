package cn.tjut.j8;

import java.util.function.Consumer;
import java.util.function.Supplier;

public class test04 {
    public static void main(String[] args) {

        System.out.println(getString(() -> "123"));

        operateString("123", System.out::println);
    }
    //定义一个方法，返回一个字符串数据
    public static String getString(Supplier<String> supplier){
        return supplier.get();
    }

    //定义一个方法，返回一个整数数据

    public static void operateString(String str , Consumer<String> con){
        con.accept(str);
    }
}
