public abstract class Human {
    private String name;

    public Human(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public void info(){
        System.out.println("Это человек по имени "+name);
    }

}
