package cn.tjut.bigdecimail;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimalDivision {
    public static void main(String[] args) {
        BigDecimal one = new BigDecimal("1");
        BigDecimal three = new BigDecimal("3");

        // 保留10位小数，使用四舍五入
        BigDecimal result = one.divide(three, 10, RoundingMode.HALF_UP);
        System.out.println("Result: " + result);
        
        
    }
}
