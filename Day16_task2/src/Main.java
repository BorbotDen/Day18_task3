import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.PushbackInputStream;
import java.util.Random;
import java.util.Scanner;

import static java.lang.Math.random;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        File file1 = new File("File1");
        File file2 = new File("File2");

        createNumbersInfile(file1,1000);
        createMeanFile(file1,file2);
        System.out.println("*******************");
        printResult(file2);
    }

    public static void createNumbersInfile(File file,int n){
        Random random=new Random();
        try(PrintWriter pw=new PrintWriter(file);) {

            for (int i = 1; i <=n; i++) {
                pw.print((i%20==0)?  " "+random.nextInt(100)+"\n":" "+random.nextInt(100));

            }


        } catch (FileNotFoundException e) {
           System.out.println("Error record");
        }
    }

    public static void createMeanFile(File file1, File file2) throws FileNotFoundException {
        Scanner inp = new Scanner(file1);
        PrintWriter pw2 = new PrintWriter(file2);
        double sum = 0, x;
        int count = 0;
        while (inp.hasNext()) {
            x = inp.nextInt();
            count++;
            sum += x;
            if (count == 20) {
                pw2.println(sum / (double) count);
                count = 0;
                sum = 0;

            }
        }
        pw2.close();
    }
 public static void printResult(File file) throws FileNotFoundException {
        Scanner inp=new Scanner(file);
        double x=0;
        while (inp.hasNext()){
        x+=Double.parseDouble(inp.next());
        }
        System.out.println((int)x);
 }
}