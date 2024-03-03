package cn.tjut.examtest;

public class OrderByArray {

    public int[] orderArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }

    public static void main(String[] args) {
        int[] array = {1, 8, 5, 2, 4, 9, 7};
        OrderByArray order = new OrderByArray();
        array = order.orderArray(array);
        for (int i : array){
            System.out.println(i);
        }
    }
}
