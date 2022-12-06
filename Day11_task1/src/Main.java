public class Main {
    public static void main(String[] args) {
        Warehouse sk1=new Warehouse();
        Warehouse sk2=new Warehouse();

      Courier cur1=new Courier(sk1);
      Picker pic1=new Picker(sk1);
                    System.out.println(sk1);
//            businessProcess(pic1);
        System.out.println(pic1);

        System.out.println(cur1);

//        businessProcess(cur1);
//                    System.out.println(sk1);

        Courier cur2=new Courier(sk2);
        Picker pic2=new Picker(sk2);
        businessProcess(cur2);
        businessProcess(pic2);
        System.out.println(cur1);
        System.out.println(sk1);
    }

    static void businessProcess(Job job){


        for (int i = 0; i <10000 ; i++) {
            job.goJob();
        }
        job.bonus();

    }
}