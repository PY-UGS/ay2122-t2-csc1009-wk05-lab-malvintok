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
    
    public double getArea(){
        return 0;
    }

    public double getPerimeter(){
        return 0;
    }

    public double getDiameter(){
        return 0;
    }

    public void printCircle(){
        System.out.println("Printing Circle......");
    }
}
