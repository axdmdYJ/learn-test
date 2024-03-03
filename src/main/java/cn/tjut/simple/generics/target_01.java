package cn.tjut.simple.generics;

import java.util.ArrayList;
import java.util.List;

/**
 * 为什么引入泛型介绍
 */
public class target_01 {
    public static void main(String[] args) {
        List<String> list = new ArrayList();
        list.add("落雨既然");
        for (int i = 0; i < list.size(); i++) {
            System.out.println((String)list.get(i));
        }
    }
}
