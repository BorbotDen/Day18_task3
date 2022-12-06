public class Tacher extends Human{

    String predmet;
    public Tacher(String name, String predmet) {
        super(name);
        this.predmet=predmet;
    }

    public String getPredmet(){
        return predmet;
    }

    public void info(){
        super.info();
        System.out.println("Это учитель по имени "+getName());
    }
}
