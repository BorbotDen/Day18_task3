import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int[] nums= {-1,-2,-3,-4,-5};
        int target=-8;
        int sum;
        for (int i = 0; i <nums.length; i++) {
            sum=target-nums[i];
            for (int j = i+1; j < nums.length; j++) {
                if (nums[j]==sum)
                    System.out.println(i+" "+j);
            }
        }


    }
}