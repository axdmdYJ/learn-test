package cn.tjut.simple.Object.equals;

import java.util.HashSet;

public class hashcode_test {
    public static void main(String[] args) {
        EqualExample e1 = new EqualExample(1, 1, 1);
        EqualExample e2 = new EqualExample(1, 1, 1);
        System.out.println(e1 == e2);
        System.out.println(e1.equals(e2)); // true
        HashSet<EqualExample> set = new HashSet<>();
        set.add(e1);
        set.add(e2);
        System.out.println(set.size());   // 2
    }
}
