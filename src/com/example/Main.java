package com.example;

public class Main {

    public static void main(String[] args) {
        System.out.println("" + getFibonacciDigit(6));
        System.out.println(reverseString("Hello World"));
        System.out.println(reverseWordOrder("Have a good day"));
    }

    private static int getFibonacciDigit(int num) {
        int previous = 0;
        int next = 1;
        int count = 1;

        while(count < num) {
            int sum = previous + next;
            previous = next;
            next = sum;
            count++;
        }

        return next;
    }

    private static String reverseString(String s) {
        String returnStr = "";

        for (int i = s.length() - 1; i >= 0; i--) {
            returnStr += s.charAt(i);
        }

        return returnStr;
    }

    private static String reverseWordOrder(String s) {
        String returnStr = "";
        String temp = " ";

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ' || i == s.length() - 1) {
                returnStr = temp + returnStr;
                temp = "" + s.charAt(i);
            }
            else {
                temp += s.charAt(i);
            }
        }

        return returnStr;
    }
}
