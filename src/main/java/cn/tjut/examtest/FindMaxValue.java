package cn.tjut.examtest;

public class FindMaxValue {
    public static void main(String[] args) {
        int[] array = {5, 12, 7, 3, 8};
        
        int maxValue = findMaxValue(array);
        
        System.out.println("数组中的最大值为：" + maxValue);
    }

    // 查找数组中的最大值
    private static int findMaxValue(int[] nums) {

        int maxValue = Integer.MIN_VALUE;

        for (int num : nums) {
            maxValue = Math.max(maxValue, num);
        }

        return maxValue;
    }
}