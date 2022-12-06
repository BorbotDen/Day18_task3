public class Motorbike {
  private   String model;
  private   String color;
    private   int year;
    public Motorbike(String model, String color, int year) {
        this.model = model;
        this.color=color;
        this.year = year;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getYear() {
        return year;
    }

    public void info(){
        System.out.println("Мотоцикл "+model+" цвета "+color +" "+year+" года выпуска");
    }
public int yearDif(int inputYear){
return Math.abs(year-inputYear);
}


}