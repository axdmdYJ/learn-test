package cn.tjut.j8;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Stream;

public class test11 {
    public static void main(String[] args) {
//        HashMap<String, String> map = new HashMap<>();
//        map.put("123", "311");
//        map.put("234", "432");
//        Stream<Map.Entry<String, String>> entryStream = map.entrySet().stream().filter(each -> !Objects.equals(each.getValue(), "432"));
        Stream.of("a1", "a2", "a3").
         filter(each -> {
             System.out.println("forEach运行啦");
             return !each.contains("a1");
         })
        .forEach(System.out::println);


    }
}
