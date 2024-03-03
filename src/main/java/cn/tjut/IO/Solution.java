package cn.tjut.IO;

//给定一个字符串 s ，请计算这个字符串中有多少个回文子字符串。 具有不同开始位置或结束位置的子串
// ，即使是由相同的字符组成，也会被视作不同的子串。
// 示例 1： 输入：s = "abc" 输出：3 解释：三个回文子串: "a", "b", "c" 示例 2： 输入：s = "aaa"
// 输出：6 解释：6个回文子串: "a", "a", "a", "aa", "aa", "aaa"
//        ```java
class Solution {
    /**
     *a,b
     * a = a+b;
     * b = a-b;
     * a = a-b;
     */

    public int countSubstrings(String s) {
        int count = 0;
        char[] c = new char[s.length()];
        for (int i = 1; i <= s.length(); i++){
            c[i-1] = s.charAt(i-1);
            if(i%2==0){
                count += expandAroundCenter(c.toString(),i/2-1,i/2);
            }else{
                count += expandAroundCenter(c.toString(),i,i);
            }
        }
        return count;
        // int[] dp = new int[s.length()];
    }
    public int expandAroundCenter(String s, int left, int right) {
        int count = 0;
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
            count++;
        }
        return count;
    }
}


