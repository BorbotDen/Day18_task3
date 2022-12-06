package org.example;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
    int sumLine=0,MaxSumLIne=0,index=0;
        Random r=new Random();
        int[][] array=new int[12][8];
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 8; j++) {
            array[i][j]=r.nextInt(50);
            sumLine+=array[i][j];
            }
            if (MaxSumLIne<=sumLine){
                MaxSumLIne=sumLine;
                index=i+1;
            }
            sumLine=0;
        }
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 8; j++) {
                sumLine+=array[i][j];
                System.out.print(" " + array[i][j]);
            }
            System.out.println("    = "+sumLine);
            sumLine=0;
        }
        System.out.println("Line - "+index+"             "+MaxSumLIne);
    }
}