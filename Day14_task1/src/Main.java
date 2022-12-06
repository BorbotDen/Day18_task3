import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        File numBase = new File("numbers");
        Scanner inp = null;
        try {
            inp = new Scanner(numBase);

            String str = inp.nextLine();
            String[] ten = str.split(" ");
            if (ten.length != 10)
                throw new IllegalArgumentException();
            int[] num = new int[10];
            int sum = 0;
            for (int i = 0; i < 10; i++) {
                num[i] = Integer.parseInt(ten[i]);
                sum += num[i];
            }
            System.out.println("Сумма всех = " + sum);

        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (IllegalArgumentException e) {
            System.out.println("Файл не корректен");
        }

    }
}
