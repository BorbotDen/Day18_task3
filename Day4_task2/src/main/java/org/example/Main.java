package org.example;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        Random random = new Random();
        int max=Integer.MIN_VALUE,min=Integer.MAX_VALUE,end0=0,sumEnd0=0;
        int[] arr=new int[100];

        for (int i = 0; i < arr.length; i++) {
            arr[i]=random.nextInt(1000);
        }

        for (int x:arr)
        {
            if (x>max)
                max=x;
            if (x<min)
                min=x;
            if (x%10==0){
                end0++;
                sumEnd0+=x;}
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("min массива - "+min);
        System.out.println("max массива - "+max);
        System.out.println("кончаются на 0 "+end0);
        System.out.println("Их колличество на 0 "+end0);



    }
}