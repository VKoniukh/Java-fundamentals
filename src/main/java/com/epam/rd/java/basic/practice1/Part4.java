package com.epam.rd.java.basic.practice1;

public class Part4 {

    public static void main(String[] args) {

        if (args.length != 2) {
            System.out.println("2 args, pls");
        }

        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);

        int n = egcd(a, b);

        System.out.print(n);

    }

    public static int egcd(int a, int b) {
        if (a == 0)
            return b;

        while (b != 0) {
            if (a > b)
                a = a - b;
            else
                b = b - a;
        }

        return a;
    }

}
