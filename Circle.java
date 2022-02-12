public class Circle extends GeometricObject{
    private double radius;

    public Circle(){
        super();
    }
    
    public Circle(double radius){
        super();
        setRadius(radius);
    }
    
    public Circle(double radius, String color, boolean filled){
        super(color, filled);
        setRadius(radius);
    }
    
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    
    public double getArea(){}

    public double getPerimeter(){}

    public double getDiameter(){}

    public void printCircle(){}
}
