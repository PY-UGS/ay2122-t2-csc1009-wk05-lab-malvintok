package Q2_Shapes;

public class TestShapes {
    public static void main(String[] args) {
        Rectangle r = new Rectangle(9, 5);

        Shape figref;
        figref = r;
        System.out.println("Area is " + figref.area());
    }
}
