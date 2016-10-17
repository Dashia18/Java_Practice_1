/**
 * Created by Daria Serebryakova on 12.10.2016.
 */
public class Circle {
    public Circle() {
        this.radius = 1.0;
        this.color = "red";
    }

    public Circle(double radius) {

        this.radius = radius;
        this.color = "red";
    }

    public Circle(double radius, String color) {
        setRadius(radius);
        setColor(color);
    }

    public double getRadius() {

        return this.radius;
    }

    public String getColor() {

        return this.color;
    }

    public void setRadius(double radius) {

        this.radius = radius;
    }

    public void setColor(String color) {

        this.color = color;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                '}';
    }

    public double getArea() {
        double area = this.radius * this.radius * Math.PI;
        return area;
    }

    private double radius;
    private String color;


}
