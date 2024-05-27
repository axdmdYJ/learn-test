package cn.tjut.j8;

import java.util.Optional;
import java.util.stream.Stream;

public class test12 {
    public static void main(String[] args) {
        boolean b = Stream.of("1", "3", "3", "4", "5", "1", "7")
                .map(Integer::parseInt)
//                .allMatch(s -> s > 0)
//                .anyMatch(s -> s >4)
                .noneMatch(s -> s > 4)
                ;
        System.out.println(b);

        Optional<String> first = Stream.of( "3", "3", "4", "5", "1", "7").findFirst();
        System.out.println(first.get());

        Optional<Integer> min = Stream.of("1", "3", "3", "4", "5", "1", "7")
                .map(Integer::parseInt)
                .min((m1, m2) -> m1 - m2);
        System.out.println(min.get());
    }
}
