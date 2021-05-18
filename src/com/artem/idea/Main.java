package com.artem.idea;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter array length: ");
        int size = scanner.nextInt();
        double[] Array;
        Array = new double[size];
        System.out.println("Insert array elements:");
        for (int i = 0; i < size; i++) {
            Array[i] = scanner.nextInt();
        }
        double average = 0;

        for (int i = 0; i < Array.length; i++) {
            if (Array.length > 0) {
                double sum = 0;
                for (int j = 0; j < Array.length; j++) {

                    sum += Array[j];
                }
                average = sum / Array.length;
            }
        }
            System.out.println("Среднее арифметическое = " + average);

            for (int i1 = 0; i1 < Array.length; i1++){

                System.out.println("Результат " + (Array[i1] * average) );
            }




    }
}
















