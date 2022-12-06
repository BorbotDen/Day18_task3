import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ScannerException{
        Scanner inp= new Scanner(System.in);
        while (true){
            int x =Integer.parseInt(inp.nextLine());

            if (x!=0) {
               throw new ScannerException("Ну что за напасть!0" +
                       "");


            }

        }

    }
}