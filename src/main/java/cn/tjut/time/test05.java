package cn.tjut.time;

import java.time.Instant;

public class test05 {
    public static void main(String[] args) {
        Instant now = Instant.now();
        System.out.println("获取此时此刻Instant信息：" + now);
        System.out.println("获取总秒数：" + now.getEpochSecond());
        System.out.println("获取不满一秒的纳秒数：" + now.getNano());
        System.out.println(now.plusSeconds(1)); // 增加一秒,但是不改变原对象
        System.out.println(now);
        System.out.println(Instant.now());
        System.out.println("判断现在这个时间和now比较：" + Instant.now().isBefore(now));
    }
}
