public class Main {
    public static void main(String[] args) {
        int n=717771237;
        System.out.println(count7(n));


    }

    public static int count7(int count){
        if (count==0)
            return 0;
        if (count%10==7)
        return 1+count7(count/10);
        else
            return count7(count/10);
    }
}