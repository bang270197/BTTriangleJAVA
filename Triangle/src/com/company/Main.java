package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap canh a:");
        double a=sc.nextDouble();
        System.out.println("Nhap canh b:");
        double b=sc.nextDouble();
        System.out.println("Nhap canh c:");
        double c=sc.nextDouble();
        Triangle triangle = new Triangle("blue",false,3,4,5);
        boolean result=triangle.isFilled();
        if (result) {
            System.out.println(triangle.toStringOn());;
        } else {
            System.out.println(triangle.toStringOff());
        }



    }
}
