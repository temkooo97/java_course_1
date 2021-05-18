package com.artem.idea;
import java.util.Scanner;
import java.io.IOException;

public class Task_5 {

        public static void main(String[] args) throws IOException {
            System.out.println("Введите целые числа через Enter: ");
            Scanner scanner = new Scanner(System.in);
            int first = scanner.nextInt();
            int second = scanner.nextInt();
            System.out.println("Введите символ: + - * или / ");
            char symbol = (char) System.in.read();
            double result;
            switch (symbol) {
                case '+':
                    result = (first + second);
                    System.out.println("Ваш результат: " + result);
                    break;
                case '-':
                    result = (first - second);
                    System.out.println("Ваш результат: " + result);
                    break;
                case '*':
                    result = (first * second);
                    System.out.println("Ваш результат: " + result);
                    break;
                case '/':
                    result = (first / second);
                    System.out.println("Ваш результат: " + result);
                    break;



        }
    }
}
