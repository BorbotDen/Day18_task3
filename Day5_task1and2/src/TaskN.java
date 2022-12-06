import java.util.Scanner;

public class TaskN {
    public static void main(String[] args) {

        Car car=new Car();
        car.setModel("BMW");
        car.setColor("Black");
        car.setYear(1994);

        Motorbike moto=new Motorbike("Kawasaki","green",2001);
        car.yearDif(10);
        moto.yearDif(22);



    }
}