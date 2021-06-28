package com.epam.rd.java.basic.practice1;

public class Part2 {

    public static void main(String[] args) {

        result();
    }
        static void result (int ...numbers){
            int value = 0;
            for(int n:numbers)
                value += n;
            System.out.print(value);
        }

    }
