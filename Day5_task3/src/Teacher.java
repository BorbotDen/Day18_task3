import java.util.Random;

public class Teacher {
    private String name;
    private String classe;

    public Teacher(String name, String classe) {
        this.name = name;
        this.classe = classe;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }
    public void evaluate (Student student){
        Random ran=new Random();
        String num="н/д";
        int x = ran.nextInt(4);
        switch (x+2) {
            case 2:
                num = "Два";
                break;
            case 3:
                num = "Три";
                break;
            case 4:
                num = "Четыре";
                break;
            case 5:
                num = "Пять";
                break;
            default:
                System.out.println("обратитесь в деканат");
        }

System.out.println("Преподаватель "+name+" оценил студента с именем "+student.getName()+" по предмету "+classe+" на оценку "+num+".");
    }
}
