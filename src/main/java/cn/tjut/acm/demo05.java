package cn.tjut.acm;

import java.util.Scanner;

public class demo05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine()){
            String alpha = scanner.nextLine();
            String[] alphas = alpha.split(" ");
            boolean flag  = false;
            double avg = 0;
            for (String a : alphas){
                int num = convert(a);
                if (num < 0) flag = true;
                avg += num * 1.0 / alphas.length;
            }
            if (flag){
                System.out.println("Unknown");
            }else {
                System.out.printf("%.2f\n", avg);
            }

        }
    }

    private static int convert(String degree) {
        switch (degree) {
            case "A":
                return 4;
            case "B":
                return 3;
            case "C":
                return 2;
            case "D":
                return 1;
            case "F":
                return 0;
            default:
                return -1;
        }
    }
}
