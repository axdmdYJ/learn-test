package reflection;


import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

import java.lang.reflect.InvocationTargetException;

@Slf4j
public class SpringTest {


    @Test
    public void test_spring01() throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class aClass = Class.forName("cn.tjut.spring.test01.HelloWorld");

        Object o = aClass.getDeclaredConstructor().newInstance();
    }
}
