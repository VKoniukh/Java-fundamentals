package com.epam.rd.java.basic.practice1;

public class Part5 {

    public static void main(String[] args) {
        String a = args [0];
            String[] n = a.split("");
            int m=1;
            for(int i=1;i<n.length;i++){
                m+=Integer.parseInt(n[0]);
            }
            System.out.print(m);
        }

}

