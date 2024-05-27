package cn.tjut.objects;

import java.util.Objects;

public class test01 {
    public static void main(String[] args) {
        String a = "abc";
        String b = null;

        System.out.println(a.equals(b));
//        System.out.println(b.equals(a));
        System.out.println(Objects.equals(a,b));

        boolean aNull = Objects.isNull(a);
        System.out.println(aNull);
    }
}
