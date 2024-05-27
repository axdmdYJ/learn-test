package cn.tjut.j8;

import java.util.Arrays;
import java.util.function.Supplier;

public class test09 {
    public static void main(String[] args) {

        fun(() -> {
            int arr[] = {22,33,55,66,44,99,10};
            // 计算出数组中的最大值
            Arrays.sort(arr);
            return arr[arr.length-1];
        });
    }

    public static void fun(Supplier<Integer> supplier){
        // get() 是一个无参的有返回值的 抽象方法
        Integer max = supplier.get();
        System.out.println("max = " + max);
    }
}
