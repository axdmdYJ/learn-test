package cn.tjut.HashMap_demo;

import java.util.Objects;

public class EqualsMyClassExample {
    public static void main(String[] args) {  
        Person u1 = new Person();  
        u1.setName("Java");  
        u1.setAge(18);  
        Person u2 = new Person();  
        u1.setName("Java");  
        u1.setAge(18);        
         // 打印 equals 结果  
        System.out.println("equals 结果：" + u1.equals(u1));
    }  
}  
class Person {  
    private String name;  
    private int age;  
    public String getName() {  
        return name;  
    }  
    public void setName(String name) {  
        this.name = name;  
    }  
    public int getAge() {  
        return age;  
    }  
    public void setAge(int age) {  
        this.age = age;  
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true; // 引用相等返回 true
        // 如果等于 null，或者对象类型不同返回 false
        if (o == null || getClass() != o.getClass()) return false;
        // 强转为自定义 Persion 类型
        Person persion = (Person) o;
        // 如果 age 和 name 都相等，就返回 true
        return age == persion.age &&
                Objects.equals(name, persion.name);
    }
    @Override
    public int hashCode() {
        // 对比 name 和 age 是否相等
        return Objects.hash(name, age);
    }

} 