package Q1_GeometricObjects;
import java.util.Date;

public class GeometricObject {
    private String color;
    private boolean filled;
    private Date dateCreated;

    public GeometricObject(){
        color = "white";
        filled = false;
        dateCreated = new Date();
    }

    public GeometricObject(String color, boolean filled){
        setColor(color);
        setFilled(filled);
        setDateCreated(new Date());
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public String toString(){
        return getDateCreated().toString();
    }
}