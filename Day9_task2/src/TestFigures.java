public class TestFigures {
    public static void main(String[] args) {
        Figure[] Figures= {
                new Triangle(10, 10, 10, "red"),
                new Triangle(10, 20, 30, "Green"),
                new Triangle(10, 20, 15, "Red"),
                new Rectangle(5, 10, "Red"),
                new Rectangle(40, 15, "Orange"),
                new Circle(4, "Red"),
                new Circle(10, "Red"),
                new Circle(5, "blue")
        };
        System.out.println(" Cумма всех красных периметров = "+calRedPerim(Figures));
        System.out.println(" Cумма всех красных площадей = "+calRedArea(Figures));

    }

    public static double calRedPerim(Figure[] Figures ){
        int x = Figures.length;
        double calc=0;
        for (int i = 0; i < x; i++) {
            if (Figures[i].color.equalsIgnoreCase("red")){
                calc+=Figures[i].perimetr();
            }
        }
        return calc;
    }
    public static double calRedArea(Figure[] Figures ){
        int x = Figures.length;
        double calc=0;
        for (int i = 0; i < x; i++) {
            if (Figures[i].color.equalsIgnoreCase("red")){
                calc+=Figures[i].area();
            }
        }
        return calc;
    }
}