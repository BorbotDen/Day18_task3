public class Main {
    public static void main(String[] args) {
        long startTime=System.currentTimeMillis();
        String str = "";
        int n=20000;
        for (int i = 0; i < n; i++) {
            str=str+i;
        }

        System.out.println(str);
        long stopTime=System.currentTimeMillis();
        System.out.println(stopTime-startTime+" msec");
        startTime=System.currentTimeMillis();
        StringBuilder strb=new StringBuilder();
        for (int i = 0; i < n; i++) {
            strb.append(i);
        }
        System.out.println(strb);
        stopTime=System.currentTimeMillis();
        System.out.println(stopTime-startTime+" msec");


    }
}