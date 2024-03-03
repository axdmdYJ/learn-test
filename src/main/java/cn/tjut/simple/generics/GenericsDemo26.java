package cn.tjut.simple.generics;

class Demo {
  // 泛型方法，可以接收任意类型的数据
  public <T> T fun(T t) {
    // 直接将参数返回
    return t;
  }
}

public class GenericsDemo26 {
  public static void main(String args[]) {
    // 实例化Demo对象
    Demo d = new Demo();
    // 传递字符串
    String str = d.fun("落雨既然");
    // 传递数字，自动装箱
    int i = d.fun(30);
    // 输出字符串内容
    System.out.println(str);
    // 输出数字内容
    System.out.println(i);
  }
//  输出：
//  落雨既然
//  30
}
