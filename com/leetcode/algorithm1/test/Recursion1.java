package com.leetcode.algorithm1.test;

public class Recursion1 {
    public static void main(String[] args) {
        System.out.println(calculateFactorial(1));
        System.out.println(calculateFactorial(2));
        System.out.println(calculateFactorial(3));
        System.out.println(calculateFactorial(4));
        System.out.println(calculateFactorial(5));
        System.out.println(calculateFactorial(6));
        System.out.println(calculateFactorial(7));


    }

    private static int calculateFactorial(int n) {
        if (n == 0) {
            return 1;
        }

        return n * calculateFactorial(n - 1);
    }
}
