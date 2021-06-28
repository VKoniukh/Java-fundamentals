package com.epam.rd.java.basic.practice1;

public class Part2 {

    public static void main(String[] args) {

        int num = 0;
        for(String arg: args) {
            num += Integer.parseInt(arg);
        }
        System.out.print(num);
    }
