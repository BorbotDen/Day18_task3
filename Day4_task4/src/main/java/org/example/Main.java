package org.example;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random=new Random();
        int TripleSum=0,MaxTripleSum=0,indexFirstNumber=0;
        int[] arr=new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=random.nextInt(10000);
        }
        System.out.println(Arrays.toString(arr));

        for (int i = 1; i < arr.length-1; i++) {
            TripleSum=arr[i-1]+arr[i]+arr[i+1];
            if (TripleSum>MaxTripleSum) {
                MaxTripleSum = TripleSum;
                indexFirstNumber=i-1;}
            TripleSum=0;
        }
        System.out.println("Максимальная тройка sum "+MaxTripleSum);
        System.out.println("Индекс первого числа "+indexFirstNumber);


    }
}