package cn.tjut.j8;

import javax.swing.text.html.Option;
import java.util.Optional;

public class test05 {
    public static void main(String[] args) {
        // 创建一个Optional类
        Optional<String> scala = Optional.of("scala");
        System.out.println(scala);
        Optional<Object> o = Optional.ofNullable(null);
        System.out.println(o);
        if (scala.isPresent()){
            System.out.println("yes");
        }
        System.out.println(scala.get());
        scala.ifPresent((value) ->{
            System.out.println(value);
        });
        scala.orElse("nullllll");
        System.out.println(o.orElse("nulllll"));
        Optional<String> s = scala.map((value) -> value + "123");
        System.out.println(s);

        scala.filter(value -> value.length() > 6);
        System.out.println(scala);
    }
}
