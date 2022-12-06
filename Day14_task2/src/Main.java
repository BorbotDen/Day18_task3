import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.IllegalFormatPrecisionException;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        File file = new File("NameTest");


        System.out.println(parseFile(file));
    }

    public static List<People> parseFile(File file) {
        List<People> peopleList = new ArrayList<>();

        try {
            Scanner inp = new Scanner(file);
            while (inp.hasNext()) {
                String str = inp.nextLine();
                String[] str12=str.split(" ");

                if (Integer.parseInt(str12[1])<0)
                    throw new IllegalArgumentException();

                peopleList.add(new People(str12[0],Integer.parseInt(str12[1])));
            }
            return peopleList;
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (IllegalArgumentException e) {
            System.out.println("Не корректный файл");
        }
        return null;
    }
}