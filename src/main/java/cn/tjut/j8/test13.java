package cn.tjut.j8;

import java.math.BigDecimal;
import java.util.stream.Stream;

public class test13 {
    public static void main(String[] args) {
        Double reduce = Stream.of(0.1, 0.3, 0.4)
                .reduce((double) 0, Double::sum);
        System.out.println(reduce);
    }
}
