public class Student extends Human {
    int group;

    public Student(String name,int group) {
        super (name);
        this.group=group;
    }

    public int getGroup() {
        return group;
    }

    public void info(){
        super.info();
        System.out.println("Это Студент по имени "+getName());
    }
}
