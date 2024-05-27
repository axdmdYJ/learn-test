package cn.tjut.time;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class test02 {
    public static void main(String[] args) throws ParseException {
        Date date = new Date();
        System.out.println(date);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String format = sdf.format(date);

        System.out.println(date);
        System.out.println(format);


        // 解析字符串时间
        String dateStr = "2024-04-25 14:49:42";
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date parse = sdf2.parse(dateStr);
        System.out.println(parse);
    }

}
