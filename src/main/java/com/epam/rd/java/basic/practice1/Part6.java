package com.epam.rd.java.basic.practice1;

public class Part6 {

    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int[] array = new int[a];
        int[] result = arr1(array);
        for (int i = 0; i < result.length; i++) {
                System.out.print(result[i] + " ");
                if (i == result.length -1)
                System.out.print(result[i]);
        }
    }

    public static int[] arr1(int[] array) {
         for (int i = 0, b = 2; i < array.length; i++, b++) {
             for (int j = b; j < Integer.MAX_VALUE; j++) {
                if (isPrime(j)) {
                    array[i] = j;
                    break;
                } else if (i > 0){
                    i--;
                    break;
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