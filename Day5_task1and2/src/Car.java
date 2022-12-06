public class Car {
private String model;
    private String color;
    private int year;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void info(){
        System.out.println("Авто "+model+" цвета "+color+" "+year+" года выпуска");
    }
    public int yearDif(int inputYear) {
        return Math.abs(year - inputYear);
    }


}
