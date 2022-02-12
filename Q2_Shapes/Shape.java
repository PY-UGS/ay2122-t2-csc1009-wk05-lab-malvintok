package Q2_Shapes;
public abstract class Shape {
    private double dim1;
    private double dim2;
    private final double PI = 3.141592654;

    public Shape(double dim1, double dim2){
        setDim1(dim1);
        setDim2(dim2);
    }

    public abstract double area();

    public double getDim1() {
        return dim1;
    }

    public void setDim1(double dim1) {
        this.dim1 = dim1;
    }

    public double getDim2() {
        return dim2;
    }

    public void setDim2(double dim2) {
        this.dim2 = dim2;
    }

    public double getPI(){
        return PI;
    }
}
