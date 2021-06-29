package com.epam.rd.java.basic.practice1;

public class Part4 {

    public static void main(String[] args1, args2) {
        int a = args1
        int b = args2
        public int egcd(int a, int b) {
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

}
