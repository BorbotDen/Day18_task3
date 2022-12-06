import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.IllegalFormatException;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)  {
        File inputFile=new File("shoes.csv");
        int count=0;
        List<Boots> NewList=new ArrayList<>();
        try{
            Scanner inp=new Scanner(inputFile);

            while (inp.hasNext()) {
                String[] oneStr = inp.nextLine().split(";");
                count++;
                if (oneStr.length!=3)
                    throw new IllegalArgumentException();
             try {
                 int n=Integer.parseInt(oneStr[2]);
                 if (n<0){
                     throw new IllegalStateException();
                 } else{
                    NewList.add(new Boots(oneStr[0],oneStr[1],n )) ;
                    System.out.println(NewList.get(count-1));
                 }
             }catch (IllegalStateException e){
                 System.out.println("Некорректное колличество в строке - "+count);
             }


            }
            inp.close();
        }catch (FileNotFoundException e){
            System.out.println("Файл не найден");
        }catch (IllegalArgumentException e){
            System.out.println("Некоектная строка № "+count);
        }
        toWriteFile(NewList);
    }

    public static void toWriteFile(List<Boots> NewList){
        File wrFile=new File("Zakaz");
        try {
            PrintWriter pw=new PrintWriter(wrFile);
            int count=0;
            for (Boots x: NewList) {
                if (x.getAmount()==0){
                pw.print(x.toString()+"\n");
                count++;}
            }
            pw.close();
            System.out.println("Успешная запись, записанных строк - "+count);
        } catch (FileNotFoundException e) {
            System.out.println("Что то пошло не так с записью");
        }

    }
}