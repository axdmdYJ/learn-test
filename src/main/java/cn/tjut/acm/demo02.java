package cn.tjut.acm;


import java.util.Scanner;

/**
 * 多组数据，每组第⼀⾏为n, 之后输⼊n⾏两个整数
 */
public class demo02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            while (n-- > 0) {
                int a = scanner.nextInt();
                int b = scanner.nextInt();
                System.out.println(a + b);
            }
        }
    }
}
