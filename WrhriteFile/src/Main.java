import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Main {
    public static void main(String[] args) {
        File F=new File("WhriteMe");
        try {
            PrintWriter pw=new PrintWriter(F);
            String x= "***";
            for (int i = 0; i < 10; i++) {

                pw.println("STRWE"+x+i+x);
            }
pw.close();

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Hello world!");
    }
}