package cn.tjut.simple.generics;

import java.util.ArrayList;
import java.util.Collections;
 
class Student implements Comparable{
    private String name;
    private int ranking;
 
    public Student(String name, int ranking){
        this.name = name;
        this.ranking = ranking;
    } 
 
    public String toString(){
        return this.name + ":" + this.ranking;
    }

    @Override //使用 @Override 注解并不是强制性的，但它是一个良好的实践，可以帮助检测潜在的错误。
    public int compareTo(Object o){
        Student s = (Student)(o);
        return this.ranking - s.ranking;
    }
}
 
public class Compare2{
    public static void main(String[] args) {
        f();
    }
    public static void f(){
        ArrayList arr = new ArrayList();
        arr.add(new Student("Jack",10));
        arr.add(new Student("Bill",23));
        arr.add(new Student("Rudy",7));
 
        System.out.println(arr);
        Collections.sort(arr);
        System.out.println(arr);
    } 
}