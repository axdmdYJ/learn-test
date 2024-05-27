package cn.tjut.acm;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class demo07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); //需要在后面添加sc.nextLine();换到下一行
        sc.nextLine();
        List<List<Integer>> adj = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            List<Integer> list = new ArrayList<>();
            String[] inputs = sc.nextLine().split(" ");
            System.out.println(inputs.toString());
            for (int j = 1; j < inputs.length; j++) {
                list.add(Integer.valueOf(inputs[j]));
            }
            adj.add(list);
        }
    }
}
