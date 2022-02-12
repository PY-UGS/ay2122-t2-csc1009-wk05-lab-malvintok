package Q2_Shapes;

public class Rectangle extends Shape{

    public Rectangle(double height, double width){
        super(height, width);
    }

    public double area(){
        System.out.println("Inside Area for Rectangle.");
        return this.getDim1() * this.getDim2();
    }
}
