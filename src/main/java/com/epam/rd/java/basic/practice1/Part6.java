package com.epam.rd.java.basic.practice1;

public class Part6 {
    private static int index = 1;

    public static void main(String[] args) {
        if (args.length != 1)
            return;
        int length = Integer.parseInt(args[0]);
        if (length < 1)
            return;
        int[] num = new int [length];
        defPrimeNum(2, num);

        for (int index = 0; index < num.length; index++) {
            if (index == num.length - 1)
                System.out.print(num[index]);
            else
                System.out.print(num[index] + " ");
        }
    }

    public static void defPrimeNum (int number, int [] num) {
        if (index == num.length)
            return;

        int divisors = 0;
                for (int nums = number; nums > 1; nums--) {
                    if (number % nums == 0)
                        divisors ++;
                    if (divisors == 2)
                        defPrimeNum(++number, num);
                }
                if (index != num.length) {
                    num[index++] = number;
                    defPrimeNum(++number, num);
                }
    }
}
