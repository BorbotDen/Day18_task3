public class Circle extends Figure{
    double radius;
    public Circle(double radius,String color){
        super(color);
        this.radius=radius;

    }

    @Override
    public double area() {
        return Math.PI*radius*radius;
    }

    @Override
    public double perimetr() {
        return 2*radius*Math.PI;
    }
}
