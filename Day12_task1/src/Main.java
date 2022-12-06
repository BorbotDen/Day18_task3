import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> carList=new ArrayList();
        carList.add("BMW");
        carList.add("AUDI");
        carList.add("HONDA");
        carList.add("VOLVO");
        carList.add("SAAB");
    System.out.println(carList);
        carList.add(3,"KAWASAKI");
        System.out.println(carList);
        carList.remove(0);
        System.out.println(carList);
        carList.remove(2);
        System.out.println(carList);
    }
}