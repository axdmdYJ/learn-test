package cn.tjut.j8;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;

public class test03 {
    public static void main(String[] args) {
//        获取数字的个数、最小值、最大值、总和以及平均值
        List<Integer> primes = Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29);
        IntSummaryStatistics intSummaryStatistics = primes.stream().mapToInt((x) -> x).summaryStatistics();
        System.out.println(intSummaryStatistics);
    }

}
