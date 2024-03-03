package cn.tjut.examtest;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CollectionTraversal {

    public static void main(String[] args) {
        // 创建一个字符串集合，添加以下元素："Java" "Python"  "C++"  "JavaScript"
        List<String> stringList = new ArrayList<>();
        stringList.add("Java");
        stringList.add("Python");
        stringList.add("C++");
        stringList.add("JavaScript");

        // 使用迭代器遍历集合
        System.out.println("使用迭代器遍历集合:");
        Iterator<String> iterator = stringList.iterator();
        while (iterator.hasNext()) {
            String element = iterator.next();
            System.out.println(element);
        }

        // 使用增强for循环遍历集合
        System.out.println("\n使用增强for循环遍历集合:");
        for (String element : stringList) {
            System.out.println(element);
        }

        // 使用forEach方法遍历集合
        System.out.println("\n使用forEach方法遍历集合:");
        stringList.forEach(System.out::println);
    }
}
