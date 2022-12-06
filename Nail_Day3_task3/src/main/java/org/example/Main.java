package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
int i=0;

        while (i<5) {
            System.out.println("Get my x and y");
            double x=inp.nextDouble();
            double y=inp.nextDouble();
            i++;
            if (y==0) {
                System.out.println("Деление на 0");
                continue;}

            System.out.println("x/y = "+(x/y));


        }
    }
}