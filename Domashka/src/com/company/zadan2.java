package com.company;

import java.util.Scanner;
public class zadan2 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int l = sc.nextInt();
        if (a > b && a < l || a > l && a < b)
            System.out.println(a);
        if (b > a && b < l || b > l && b < a)
            System.out.println(b);
        if (l > a && l < b || l > b && l < a)
            System.out.println(l);
        else System.out.println("No");

    }
}