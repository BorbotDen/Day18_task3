public class Main {
    public static void main(String[] args) {
        Airplane plane1 = new Airplane("Stoll", 2000, 8, 750);
        Airplane plane2 = new Airplane("Cesna", 1972, 8, 1150);
        Airplane.compareAirplanes(plane1,plane2);

    }
}