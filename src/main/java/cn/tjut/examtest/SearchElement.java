package cn.tjut.examtest;

public class SearchElement {
    public static void main(String[] args) {
        int[] numbers = {8, 15, 2, 7, 10, 25, 4};
        int target = 10;
        
        // 搜索目标元素
        boolean isFound = searchElement(numbers, target);

        // 输出搜索结果
        System.out.println("Is " + target + " found? " + isFound);
    }

    // 搜索元素的方法
    private static boolean searchElement(int[] arr, int target) {
        for (int num : arr) {
            if (num == target) {
                return true;
            }
        }
        return false;
    }
}