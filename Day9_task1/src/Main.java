public class Main {
    public static void main(String[] args) {
        Student student=new Student("Ivan",117);
        Tacher tacher=new Tacher("Marivanona","Phisic");
        System.out.println("student - "+student.getName());
        System.out.println("Teacher - "+tacher.getName());
        tacher.info();
        student.info();

    }
}