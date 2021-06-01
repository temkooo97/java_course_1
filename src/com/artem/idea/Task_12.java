package com.artem.idea;

public class Task_12 {
    public static void main(String[] args) {
        String str = "I like Java!!!";
        boolean result1;
        result1 = str.contains("Java");
        boolean result2;
        result2 = str.startsWith("I like");
        boolean result3;
        result3 = str.endsWith("!!!");
        boolean result4;
        if(result1==result2==result3==true){
            String result = str.toUpperCase();
            System.out.println(result);

        }
        String res = str.replace('a','o');
        res = res.substring(7,11);
        System.out.println(res);





    }
}
