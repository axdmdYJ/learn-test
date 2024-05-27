package cn.tjut.time;

import java.util.Date;

public class test01 {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date);
        long time = date.getTime();
        time += 2 * 1000;
        Date date2 = new Date();
        date2.setTime(time);
        System.out.println(date2);
    }
}
