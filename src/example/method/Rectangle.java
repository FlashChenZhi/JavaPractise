package example.method;

public class Rectangle extends Figure {
    public Rectangle(double a, double b) {
        super(a, b);
    }

    Double area(){
        System.out.println("子类的方法.");
        return (dim1*dim2);
    }

}
