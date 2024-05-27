package cn.tjut.arrays;

import java.util.Arrays;
import java.util.List;
import java.util.function.IntToDoubleFunction;

public class test01 {
    public static void main(String[] args) {
        int[] arr = {10, 15, 20, 12};
        List<int[]> list = Arrays.asList(arr);
        System.out.println("toString前：" + arr);

        System.out.println("toString后：" + Arrays.toString(arr));

        int[] arr2 = Arrays.copyOfRange(arr, 1, 4);
        System.out.println(Arrays.toString(arr2));

        int[] arr3 = Arrays.copyOf(arr, 50);
        System.out.println(Arrays.toString(arr3));

        double[] prices = {2.2, 3.3};
        Arrays.setAll(prices, new IntToDoubleFunction() {
            @Override
            public double applyAsDouble(int value) {
                return prices[value]*0.8;
            }
        });

        System.out.println(Arrays.toString(prices));
    }
}
