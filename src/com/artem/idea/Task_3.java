package com.artem.idea;

public class Task_3 {
    public static void main(String[] args) {
        double [] myList = {1.9,2.9,3.4,3.5,3.6};
        double temp = myList[0];
        myList[0]=myList[4];

        myList[3]= temp;
        double result = myList[0]+myList[2];
        System.out.println(result);
    }
}
