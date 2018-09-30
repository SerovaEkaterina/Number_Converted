package com.company;

import java.util.Scanner;

public class Main {

    private static long sbf;
    String y;

    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.println("Введите число в десятичной системе счисления");
        long x = num.nextLong();
        System.out.println("Введите тип переменной");
        String y = num.next();

        if (y.equals("byte")) {
            System.out.println("Идет перевод...");
        } else if (y.equals("short")) {
            System.out.println("Идет перевод...");
        } else if (y.equals("integer")) {
            System.out.println("Идет перевод...");
        } else if (y.equals("long")) {
            System.out.println("Идет перевод...");
        } else {
            System.out.println("Такого типа данных нет");
        }
        if ((y.equals("byte"))|(y.equals("short"))|(y.equals("integer"))|(y.equals("long"))){
            String K = "";
            if ((x / 2) != 1) {
                for (long i = x; i >= 1; i = i / 2) {
                    System.out.println("\nЗначение x: " + i + " " + i % 2);
                    sbf = i % 2;
                    K += sbf;
                }

                StringBuffer smr = new StringBuffer(K);
                System.out.println("Число в двузначной системе счисления = " + smr.reverse());
            } else {
                System.out.println("0");
            }
            }else{
            System.out.println("Ошибка");


        }
    }
}
