package cn.tjut.time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;

public class test04 {
    public static void main(String[] args) {

        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);

        System.out.println(LocalDate.now());

        LocalDate now1 = LocalDate.now();

        // 修改日期
        LocalDate localDate = now1.withMonth(1);
        System.out.println(localDate);

        // 时区时间
        ZonedDateTime now2 = ZonedDateTime.now();
        System.out.println(now2);

        ZonedDateTime zonedDateTime = now2.withMonth(2);
        System.out.println(zonedDateTime);
    }
}
