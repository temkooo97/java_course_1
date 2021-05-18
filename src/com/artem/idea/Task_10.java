package com.artem.idea;
import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Task_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter rows count ");
        int rows = scanner.nextInt();
        System.out.println("Enter columns count");
        int columns = scanner.nextInt();
        double[][] Array;
        Array = new double[rows][columns];

        for (int i = 0;i<Array.length;i++){
            for (int j = 0;j<Array[i].length;j++){
                System.out.println("Введите элемент Array [" + i + "][" + j + "]: ");
                Array[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Исходный массив: ");
        System.out.println(Arrays.deepToString(Array));


            for(int j = 0; j < Array[0].length;j++){
                Array[0][j] =  Array[0][j] * 3;


            }
        System.out.println("Результат преобразований: ");
        System.out.println(Arrays.toString(Array[0]));



        }

    }

