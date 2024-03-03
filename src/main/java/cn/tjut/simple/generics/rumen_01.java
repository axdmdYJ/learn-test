package cn.tjut.simple.generics;

public class rumen_01 {
    public static void main(String[] args) {
        int intResult = (int) add(2, 3);      // 调用泛型方法，整型参数会被自动装箱为Integer
        float floatResult = (float) add(2.5f, 3.7f);
        double doubleResult = add(2.5, 3.7);

        System.out.println("intResult: " + intResult);
        System.out.println("floatResult: " + floatResult);
        System.out.println("doubleResult: " + doubleResult);
    }

    private static <T extends Number> double add(T a, T b) {
        System.out.println(a + "+" + b + "=" + (a.doubleValue() + b.doubleValue()));
        return a.doubleValue() + b.doubleValue();


    }
}
