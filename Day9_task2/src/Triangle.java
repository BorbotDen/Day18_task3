public class Triangle extends Figure {
    double x;
    double y;
    double z;

    public Triangle (double x,double y, double z,String color){
        super(color);
        this.x=x;
        this.y=y;
        this.z=z;
    }
    @Override
    public double area(){
        double p=perimetr()*0.5;
        return Math.sqrt(p*(p-x)*(p-y)*(p-z));
    }

    @Override
    public double perimetr() {
        return x+y+z;
    }
}
