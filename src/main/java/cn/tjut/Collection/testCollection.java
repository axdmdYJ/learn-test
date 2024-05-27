package cn.tjut.Collection;

import java.util.ArrayList;
import java.util.Collection;

public class testCollection {
    public static void main(String[] args) {
        Collection col = new ArrayList();
        col.add(1);
        col.add(2);
        System.out.println("集合是否为空：" + col.isEmpty());
        Collection col1 = new ArrayList();
        col1.add(1);
        col1.add(2);
        System.out.println(col.equals(col1));
        System.out.println(col);

//        col.clear();
        boolean remove = col.remove(1);
        System.out.println(remove);
        System.out.println(col);
    }
}
