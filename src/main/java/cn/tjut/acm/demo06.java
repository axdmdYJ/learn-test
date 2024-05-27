package cn.tjut.acm;

public class demo06 {
    public static void main(String[] args) {
        /*** 输出字符串 ***/
// %s表示输出字符串，也就是将后面的字符串替换模式中的%s
        System.out.printf("%s", new Integer(1212));
// %n表示换行
        System.out.printf("%s%n", "end line");
// 还可以支持多个参数
        System.out.printf("%s = %s%n", "Name", "Zhangsan");
// %S将字符串以大写形式输出
        System.out.printf("%S = %s%n", "Name", "Zhangsan");
    }


}
