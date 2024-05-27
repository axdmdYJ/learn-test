package cn.tjut.set;

import java.util.TreeMap;
import java.util.TreeSet;

public class TreeSetTest01 {
    public static void main(String[] args) {
        TreeSet<Integer> integers = new TreeSet<>();
        integers.add(1);
        integers.add(3);
        integers.add(2);
        integers.add(1);
        System.out.println(integers.size());
        System.out.println(integers);
        TreeMap<Object, Object> objectObjectTreeMap = new TreeMap<>();
    }
}
