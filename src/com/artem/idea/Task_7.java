package com.artem.idea;
import java.io.IOException;
import java.util.Scanner;

public class Task_7 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter array length: ");
            int size = scanner.nextInt();
            int[] Array = new int[size];
            System.out.println("Insert array elements:");
            for (int i = 0; i < size; i++) {
                Array[i] = scanner.nextInt();
            }
            System.out.println("Введите константы x y z через Enter");
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            int z = scanner.nextInt();
            for (int i = 0; i < Array.length; i++) {
                if (Array[i] == x || Array[i] == y || Array[i] == z) {
                    System.out.println("Данное значение имеется в константах");
                }


            }

    }
}
