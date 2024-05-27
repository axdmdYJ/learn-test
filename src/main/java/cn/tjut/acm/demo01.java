package cn.tjut.acm;

import java.util.Scanner;

/**
 * 多行输入，每行两个整数
 */
public class demo01 {
    public static void main(String[] args) {
        // 创建一个Scanner对象，用于从标准输入（通常是键盘）读取数据
        Scanner in = new Scanner(System.in);

        // 使用while循环不断地检查是否有更多的整数输入，输入非整数值退出
        while(in.hasNextInt()){
            // 读取下一个整数并赋值给变量a
            int a = in.nextInt();
            // 读取下一个整数并赋值给变量b
            int b = in.nextInt();
            // 打印变量a和b的和
            System.out.println(a+b);
        }
        // 当没有更多的整数输入时，循环结束，程序自然退出
    }

}
