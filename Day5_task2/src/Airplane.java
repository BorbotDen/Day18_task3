public  class Airplane {
    private String manufacturer;// (изготовитель)
    private int year;// (год выпуска)
    private int length;// (длина)
    private int weight;// (вес)
    private int fuel;// (количество топлива в баке)

    public String getManufacturer() {
        return manufacturer;
    }

    public Airplane(String manufacturer, int year, int length, int weight) {
        this.manufacturer = manufacturer;
        this.year = year;
        this.length=length;
        this.weight = weight;
        this.fuel = 0;


    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getFuel() {
        return fuel;
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }

    public void fuelUp(int fuelup){
        this.fuel+=fuelup;
    }
    public void info(){
        System.out.println("Свмолет марки - "+manufacturer+"\n"+
                        "Год выпуска - "+year+"\n"+
                        "Длинна - "+length+" метров \n"+
                        "Вес - "+weight+" кг\n"+
                        "Топлива в баке - "+fuel+" литров\n");

    }
    public static void compareAirplanes(Airplane air1,Airplane air2){
        if (air1.length>air2.length)
             System.out.println("САмолет "+air1.manufacturer+" длиннее");
        if (air1.length==air2.length)
            System.out.println("САмолеты "+air1.manufacturer+" и "+air2.manufacturer+" одной длинны");
        if (air1.length<air2.length)
            System.out.println("САмолет "+air2.manufacturer+" длиннее");

    }

    @Override
    public String toString() {
        return "Airplane{" +
                "manufacturer='" + manufacturer + '\'' +
                ", year=" + year +
                ", length=" + length +
                ", weight=" + weight +
                ", fuel=" + fuel +
                '}';
    }
}
