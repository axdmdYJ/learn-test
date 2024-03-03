package cn.tjut.examtest;

import java.util.Arrays;

public class ReverseString {
    public static void reverseString(char[] s) {
        int left = 0;
        int right = s.length - 1;

        while (right > left) {
            swap(s, left, right);
            right--;
            left++;
        }
    }

    private static void swap(char[] s, int left, int right) {
        char temp = s[left];
        s[left] = s[right];
        s[right] = temp;
    }

    public static void main(String[] args) {
        char[] inputArray = "Hello, World!".toCharArray();
        
        System.out.println("Original String: " + Arrays.toString(inputArray));

        reverseString(inputArray);

        System.out.println("Reversed String: " + Arrays.toString(inputArray));
    }
}
