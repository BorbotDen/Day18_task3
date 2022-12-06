import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] numbers = {1, 10, 1241, 50402, -50, 249, 10215, 665, 2295, 7, 311};
        System.out.println(arrSum(numbers, numbers.length-1));
        System.out.println(Arrays.toString(numbers));
    }

    public static int arrSum(int[] numbers,int i){

        if (i>0) {
            numbers[i-1]+=numbers[i];
            arrSum(numbers,i-1);
            System.out.println("ss");
        }
    return numbers[0];
    }
}