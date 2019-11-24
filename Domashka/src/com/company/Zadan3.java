package com.company;

import java.util.Scanner;
public class Zadan3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Программа находит расстояние от заданной точки на прямой до отрезка [0;1]");
        double a = sc.nextDouble();
        if (a>=1)
            System.out.println(a-1);
        if (a<=0)
            System.out.println(-(a));

    }
}