package example.method;

public class Figure {
    double dim1;
    double dim2;

    public Figure(double dim1, double dim2) {
        this.dim1 = dim1;
        this.dim2 = dim2;
    }

    Double area(){
        System.out.println("父类求面积方法:");
        return (dim1*dim2);
    }
}
