package com.epam.rd.java.basic.practice1;

public class Part6 {

    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int[] array = new int[a];
        int[] result = arr1(array);
        for (int j : result) {
            System.out.print(j);
        }
    }

    public static int[] arr1(int[] array) {
         for (int i = 0, b = 2; i < array.length; i++, b++) {
            for (int j = b; j < Integer.MAX_VALUE; j++) {
                if (isPrime(j)) {
                    array[i] = j;
                } else {
                    i--;
                }
            }
        }
        return array;
    }

    public static boolean isPrime(int a) {
        int counter = 0;
        for (int i = 2; i < a; i++) {
            if (a % i != 0) {
                counter++;
            }
        }
        return counter == (a - 2);
    }
}