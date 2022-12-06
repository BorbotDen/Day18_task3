import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        File wholenum=new File("WholeNum");

printResult(wholenum);


    }

    public static void printResult(File file){
        try (Scanner inp=new Scanner(file)) {
            int sum=0,n=0;
            while (inp.hasNext()){
                sum+= inp.nextInt();
                n++;

            }
            double arefm=(double)sum/n;
            System.out.printf("Srednee arefm = %.10f\n%.3f",arefm,arefm);
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");

        }
    }
}