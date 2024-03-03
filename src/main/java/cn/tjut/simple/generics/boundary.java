package cn.tjut.simple.generics;

import java.util.List;

class A{}
class B extends A {

}

public class boundary {

    // 如下两个方法不会报错
    public static void funA(A a) {
        // ...
    }
    public static void funB(B b) {
        funA(b);
        // ...
    }

    public static void funC(List<? extends A> listA) {
        // ...
    }
    public static void funD(List<B> listB) {
        funC(listB); // OK
        // ...
    }
//    // 如下funD方法会报错
//    public static void funC(List<A> listA) {
//        // ...
//    }
//    public static void funD(List<B> listB) {
//        funC(listB); // Unresolved compilation problem: The method doPrint(List<A>) in the type test is not applicable for the arguments (List<B>)
//        // ...
//    }
}
