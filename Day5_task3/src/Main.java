public class Main {
    public static void main(String[] args) {
        Student student=new Student("Василий Кифиров");
        Teacher teacher=new Teacher("Маривановна","физика");
        for (int i = 0; i < 10; i++) {
            teacher.evaluate(student);
        }


    }
}