package com.artem.idea;

import java.util.Scanner;

public class Task_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите что переводить : 1 - масса, 2 - расстояние");
        int choose = scanner.nextInt();
        double result;
        switch (choose) {
            case 1:
                System.out.println("Выберите единицу измерения расстояния : 1 - метр, 2 - миля, 3 - ярд, 4 - фут ");
                int choose_length = scanner.nextInt();
                System.out.println("Введите расстояние в метрах :");
                double distance = scanner.nextInt();
                switch (choose_length){
                    case 1:
                        result = distance;
                        System.out.println("Результат :" + result );
                        break;
                    case 2:
                        result = distance / 1609;
                        System.out.println("Результат :" + result );
                        break;
                    case 3:
                        result = distance * 1.094;
                        System.out.println("Результат :" + result );
                        break;
                    case 4:
                        result = distance * 3.281;
                        System.out.println("Результат :" + result );
                        break;
                }

                break;
            case 2:
                System.out.println("Выберите единицу измерения длинны 1-киллограмм, 2- грамм, 3 - Фунт, 4 - Унция    ");
                int choose_weight = scanner.nextInt();
                System.out.println("Введите массу в граммах :");
                double weight = scanner.nextInt();
                switch (choose_weight){
                    case 1:
                        result = weight / 1000 ;
                        System.out.println("Результат :" + result );
                        break;

                    case 2:
                        result = weight;
                        System.out.println("Результат :" + result );
                        break;
                    case 3:
                        result = weight / 454;
                        System.out.println("Результат :" + result );
                        break;
                    case 4:
                        result = weight / 28.35;
                        System.out.println("Результат :" + result );
                        break;
                }

                break;

        }
    }
}
