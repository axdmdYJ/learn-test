package cn.tjut.time;

import javax.swing.text.DateFormatter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class test06 {
    public static void main(String[] args) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy年MM月dd日");

        LocalDateTime now = LocalDateTime.now();
        System.out.println("格式化之前" + now);
        System.out.println("格式化之后" + formatter.format(now));

        String str  = now.toString();
        System.out.println("来一个字符串:" + str);
        
        System.out.println("解析字符串:" + LocalDateTime.parse(str, formatter));
    }
}
