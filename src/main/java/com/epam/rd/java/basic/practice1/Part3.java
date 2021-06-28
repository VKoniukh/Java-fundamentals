package com.epam.rd.java.basic.practice1;

public class Part3 {

    public static void main(String[] args) {
        StringBuilder strBuilder = new StringBuilder(args.length)

        for (int i = 0; i < args.length; i++){
            System.out.print(strBuilder.toString());
        }

    }
	
}
