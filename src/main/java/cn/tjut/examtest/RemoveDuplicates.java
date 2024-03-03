package cn.tjut.examtest;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {

    public static void main(String[] args) {
          String str = "programming";
        // 去除重复字符
        String result = removeDuplicates(str);
        // 输出结果
        System.out.println("去除重复字符后的字符串: " + result);
    }

    private static String removeDuplicates(String input) {
        // 使用 LinkedHashSet 保持字符顺序且去除重复
        Set<Character> charSet = new LinkedHashSet<>();

        // 将字符逐个添加到集合中
        for (char c : input.toCharArray()) {
            charSet.add(c);
        }

        // 构建结果字符串
        StringBuilder resultBuilder = new StringBuilder();
        for (char c : charSet) {
            resultBuilder.append(c);
        }

        return resultBuilder.toString();
    }
}