package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        while (true) {
            System.out.println("Get my x and y");
            double x=inp.nextDouble();
            double y=inp.nextDouble();
            if (y==0)
                break;
            System.out.println("x/y= "+(x /y) );
        }
    }
}