package cn.tjut.annotation;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;


@MyTest4(value = "123", a = 10, bbb = {"123", "321"})
public class Demo {


    @MyTest4(value = "123", a = 10, bbb = {"123", "321"})
    public void test01(){

    }
}


class AnnotationTest3{
    public static void main(String[] args) throws NoSuchFieldException, NoSuchMethodException {
        Class<Demo> demo = Demo.class;
        if(demo.isAnnotationPresent(MyTest4.class)){
            Method method = demo.getMethod("test01");
            System.out.println("得到啦方法！！：" + method.getAnnotation(MyTest4.class).value());
            MyTest4 mytest4 = demo.getDeclaredAnnotation(MyTest4.class);
            System.out.println(mytest4.value());
            System.out.println(Arrays.toString(mytest4.bbb()));
        }
    }
}
