package com.company;

import java.util.Scanner;

public class Zadan5 {
    public static void main(String[] args) {


        double D;
        Scanner sc = new Scanner(System.in);
        System.out.println("Программа находит корни квадратного уравнения ax^2 + bx + c");
        System.out.println("Введите старший коэффициент a");
        int a = sc.nextInt();
        System.out.println("Введите коэффициент b");
        int b = sc.nextInt();
        System.out.println("Введите свободный член c");
        int c = sc.nextInt();
        if (a != 0) {
            D = Math.pow(b, 2) - 4 * a * c;
            if (D > 0) {
                double x1 = (-(b) + Math.sqrt(D)) / (2 * a);
                double x2 = (-(b) - Math.sqrt(D)) / (2 * a);
                System.out.println(x1);
                System.out.println(x2);
            }
            if (D == 0) {
                double x3 = -b/(2 * a);
                System.out.println(x3);
            }
            if (D < 0)
                System.out.println("Корней нет");
        }
        else System.out.println("Это не квадратное уравнение так как a=0");

    }
}