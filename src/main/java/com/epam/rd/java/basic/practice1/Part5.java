package com.epam.rd.java.basic.practice1;

public class Part5 {

    public static void main(String[] args) {
        String a = args[0];
        String[] n = a.split("");
        int size = n.length;
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = Integer.parseInt(n[i]);
        }
        int sum = 0;
        for (int j : arr) {
            sum = sum + j;
        }
        System.out.println(sum);
    }
}

