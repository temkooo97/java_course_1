package com.artem.idea;

import java.util.Scanner;

public class Task_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите любое целое число:  ");
        int number = scanner.nextInt();
        int sum = 0;
        for (int i = 1; i <= number; i++){
            if (i % 2 != 0) {
                sum = sum + i;
            }
        }

        System.out.println("Результат : " + sum );
    }
}
