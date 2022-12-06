import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String s="LVIII";
        String[] str=s.split("");
        int [] arab=new int[str.length+1];
        for (int i = 0; i < str.length; i++) {
            switch (str[i]){
                case "M":
                    arab[i]=1000;
                    break;
                case "D":
                    arab[i]=500;
                    break;
                case "C":
                    arab[i]=100;
                    break;
                case "L":
                    arab[i]=50;
                    break;
                case "X":
                    arab[i]=10;
                    break;
                case "V":
                    arab[i]=5;
                    break;
                case "I":
                    arab[i]=1;
                    break;
            }
        }
        int sum=0;
        for (int i = 0; i < arab.length-1; i++) {
            if (arab[i]<arab[i+1]) {
                sum -= arab[i];

            }else {
                sum+=arab[i];
            }
        }


        System.out.println((sum));
    }
}