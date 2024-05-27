package cn.tjut.objects;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class test02 {
    public static void main(String[] args) {
        BigDecimal bigDecimal = BigDecimal.valueOf(0.1);
        BigDecimal bigDecimal1 = BigDecimal.valueOf(0.3);
        System.out.println(bigDecimal.divide(bigDecimal1, 2, RoundingMode.FLOOR));

        System.out.println(bigDecimal.intValue());
    }
}
