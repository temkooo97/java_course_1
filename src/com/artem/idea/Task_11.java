package com.artem.idea;


import java.util.Scanner;

public class Task_11 {

    public static void main(String[] args) {
        System.out.println("Введите первое число: ");

        Scanner scanner = new Scanner(System.in);
        String first =  scanner.nextLine();
        System.out.println("Введите второе число: ");
        int second = scanner.nextInt();
        Integer int_first = new Integer(first);
        int result ;
        result = int_first.compareTo(second);
        int Max_result;
        Max_result = Math.max(int_first,second);
        System.out.println("Большее число: " + Max_result);
        int Min_result;
        Min_result = Math.min(int_first,second);
        double Min_result_double;
        Min_result_double = new Double(Min_result);
        System.out.println("Меньшее число:  " + Min_result_double);








      }

       }










