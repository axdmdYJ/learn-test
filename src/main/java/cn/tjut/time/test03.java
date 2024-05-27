package cn.tjut.time;

import java.time.Month;
import java.util.Calendar;

public class test03 {
    public static void main(String[] args) {
        Calendar instance = Calendar.getInstance();

        // 2. 获取年
        int year = instance.get(Calendar.YEAR);
        System.out.println("哪一年：" + year);

        System.out.println("一个月那一天：" + instance.get(Calendar.DAY_OF_MONTH));

        System.out.println("一个月哪一年：" + instance.get(Calendar.YEAR));

        instance.set(Calendar.YEAR, 2025);
        System.out.println("年份修改后：" + instance);

        instance.add(Calendar.YEAR, 100);


    }
}
