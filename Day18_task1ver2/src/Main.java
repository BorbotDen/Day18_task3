public class Main {
    public static void main(int[] numbers) {

        System.out.println(recursionSum(numbers,numbers.length));


    }

    public static int recursionSum(int[] arr, int i ){
        if (i==0) {
            return 0;
        }
        i--;
        return   arr[i]+ (recursionSum(arr,i));
    }
}