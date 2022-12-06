import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> num=new ArrayList<>();
getEven(0,30,num);
        System.out.println(num);
        getEven(300,350,num);
int x= 1554;
num.add(x);
        System.out.println(num);

    }

    public static void getEven(int a,int b,ArrayList num){
        for (int i = a; i <= b; i++) {
            if (i%2==0&&i!=0)
                num.add(i);


        }
    }
}