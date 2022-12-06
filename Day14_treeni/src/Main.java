import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

//        String path1="C:\\Users\\Den\\Documents\\Code\\Test\\Test 1.txt";
//        String path2="C:\\Users\\Den\\Documents\\Code\\Test\\int Text.txt";
        File test=new File("test.txt");
        try {

            Scanner inp=new Scanner(test);
            String line= inp.nextLine();
            String[] str = line.split(" ");
            int[] num=new int[3];
            int count=0;

            for ( String x:str) {
                num[count++]=Integer.parseInt(x);
            }
            System.out.println(Arrays.toString(num));

            inp.close();
        }
        catch (FileNotFoundException e) {
            System.out.println("Где долбаный файл?!");
        }



    }
}