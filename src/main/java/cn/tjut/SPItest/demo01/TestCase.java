package cn.tjut.SPItest.demo01;

import java.util.Iterator;
import java.util.List;
import java.util.ServiceLoader;
public class TestCase {
    public static void main(String[] args) {
        // 使用Java的ServiceLoader机制加载实现了Search接口的类

        // 通过ServiceLoader加载Search接口的实现类
        ServiceLoader<Search> s = ServiceLoader.load(Search.class);

        // 获取实现类的迭代器
        Iterator<Search> iterator = s.iterator();

        // 遍历所有实现类并调用searchDoc方法搜索文档
        while (iterator.hasNext()) {
            // 获取下一个实现类的实例
            Search search = iterator.next();
            // 调用实现类的searchDoc方法搜索文档，参数为"hello world"
            search.searchDoc("hello world");
        }
    }
}
