package cn.tjut.examtest;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 输入整数
        System.out.print("请输入一个整数: ");
        int number = scanner.nextInt();

        // 计算阶乘
        long factorialResult = calculateFactorial(number);

        // 输出结果
        System.out.println(number + "的阶乘是: " + factorialResult);
    }

    // 计算阶乘的实现
    private static long calculateFactorial(int n) {

        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }

        return result;
    }
}
