/**
 * Created by dbobkova on 12.10.2016.
 */
public class Rectangle {
    public Rectangle() {
        this.length = 1.0f;
        this.width = 1.0f;
    }

    public Rectangle(float length) {
        setLength(length);
        this.width = 1.0f;
    }

    public Rectangle(float length, float wigth) {
        setLength(length);
        setWight(wigth);
    }

    public float getLength() {
        return length;
    }

    public float getWight() {
        return width;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public void setWight(float width) {
        this.width = width;
    }

    public double getArea() {
        double area = length * width;
        return area;
    }

    public double getPerimeter() {
        double perimeter = 2 * (length + width);
        return perimeter;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                '}';
    }

    private  float length;
    private  float width;
}
