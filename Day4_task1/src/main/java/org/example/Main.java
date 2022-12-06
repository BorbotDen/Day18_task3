package org.example;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.println("Ввведите размер массива");
        int n=inp.nextInt();
        Random r=new Random();
        int[] array=new int[n];
        int     more8    =0,
                eqlsOne  =0,
                even     =0,
                noteven  =0,
                summ     =0;
        for (int i = 0; i < array.length; i++) {
            array[i]=r.nextInt(10);
            if (array[i]>8)
                more8++;
            if (array[i]==1)
                eqlsOne++;
            if (array[i]%2==0&&array[i]!=0)
                even++;
            if (array[i]%2==1)
                noteven++;
            summ+=array[i];
        }
        System.out.println(Arrays.toString(array));
        System.out.println("Длинна массива "+array.length);
        System.out.println("Болше 8 - "+more8);
        System.out.println("Равно 1 - "+eqlsOne);
        System.out.println("Четные - "+even);
        System.out.println("Нечетные - "+noteven);
        System.out.println("Сумма всех - "+summ);
    }
}