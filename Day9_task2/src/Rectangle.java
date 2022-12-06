public class Rectangle extends Figure {
    double l;
    double h;

    public Rectangle(double l,double h,String color){
        super(color);
        this.l=l;
        this.h=h;
    }
    @Override
    public double area(){
        return l*h;
    }
    @Override
    public double perimetr(){
        return 2*(l+h);
    }
}
