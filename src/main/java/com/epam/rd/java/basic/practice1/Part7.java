package com.epam.rd.java.basic.practice1;

public class Part7 {
    static final String ARROW = " ==> ";
    public static void main(String[] args) {
        System.out.println("A" + ARROW + str2int("A") + ARROW + int2str(str2int("A")));
        System.out.println("B" + ARROW + str2int("B") + ARROW + int2str(str2int("B")));
        System.out.println("Z" + ARROW + str2int("Z") + ARROW + int2str(str2int("Z")));
        System.out.println("AA" + ARROW + str2int("AA") + ARROW + int2str(str2int("AA")));
        System.out.println("AZ" + ARROW + str2int("AZ") + ARROW + int2str(str2int("AZ")));
        System.out.println("BA" + ARROW + str2int("BA") + ARROW + int2str(str2int("BA")));
        System.out.println("ZZ" + ARROW + str2int("ZZ") + ARROW + int2str(str2int("ZZ")));
        System.out.println("AAA" + ARROW + str2int("AAA") + ARROW + int2str(str2int("AAA")));
        System.out.println(rightColumn(args[0]));
    }

    public static int str2int(String number) {
        int res = 0;
        for (int i = 0, j = number.length() - 1; i < number.length(); i++, j--) {
            res += (number.charAt(j)-64)*Math.pow(26, i);
        }
        return res;
    }

    public static String int2str(int number) {
    StringBuilder str = new StringBuilder();
        while (number > 0) {
            int rem = number % 26;
            if (rem == 0) {
                str.append("Z");
                number = (number / 26) - 1;
            } else {
                str.append((char) ((rem - 1) + 'A'));
                number = number / 26;
            }
        }
        return str.reverse().toString();
    }

    public static String rightColumn(String number) {
        int i = Integer.parseInt(number);
        return String.valueOf(i + 1);
    }
}
