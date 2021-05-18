package com.artem.idea;
import java.util.Scanner;
public class Task_4 {
    public static void main(String[] args) {
        System.out.println("Введите x y z ");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int z = scanner.nextInt();
        double result = (x + y + z ) / 3;
        System.out.println("Среднее арифметическое :" + " " + result);
        double mid_result = Math.floor(result/2);
        if (mid_result > 3) {
            System.out.println("Программа выполнена корректно");
        }

    }
}
