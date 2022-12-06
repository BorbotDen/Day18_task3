import java.security.Signature;

public class Main {
    public static void main(String[] args) {
        boolean q;
        int num=11004979;
        long startTime = System.nanoTime();
        q=Prime1(num);
        long endTime = System.nanoTime();
        System.out.println(q+" "+(endTime-startTime)+" ns");

        startTime = System.nanoTime();

        q=Prime2(num);
        endTime = System.nanoTime();
        System.out.println(q+" "+(endTime-startTime)+" ns");




    }

    public static boolean Prime1(int num){
        if(num == 2 || num == 3) {
            return true;
        }

        if(num <= 1 || num % 2 == 0 || num % 3 == 0) {
            return false;
        }

        for(int i = 5; i * i <= num; i += 6) {
            if(num % i == 0 || num % (i + 2) == 0) {
                return false;
            }
        }

        return true;
    }





    public static boolean Prime2(int num){
        if ( num <= 0 || num == 1){
            return false;
        }
        int a = (int) Math.sqrt(num);

        for (int i = 2; i <= a ; i++){

            if ( num % i == 0) {

                return false;

            }
        }

        return true;

}}

