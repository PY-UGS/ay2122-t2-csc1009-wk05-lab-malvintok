package Q2_Shapes;

public class Ellipse extends Shape{
    public Ellipse(double semiMajor, double semiMinor){
        super(semiMajor, semiMinor);
    }

    public double area(){
        System.out.println("Inside Area for Ellipse.");
        return this.getPI() * this.getDim1() * this.getDim2();
    }
}
