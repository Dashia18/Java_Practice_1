/**
 * Created by dbobkova on 12.10.2016.
 */
public class Circle {
    public Circle(){
        _radius = 1.0;
        _color = "red";
    }
    public Circle(double radius){

        _radius = radius;
        _color = "red";
    }
    public Circle(double radius, String color){
        setRadius(radius);
        setColor(color);
    }

    public double getRadius(){return  _radius;}
    public String getColor(){return  _color;}

    public void setRadius(double radius){ _radius = radius;}
    public void setColor(String color){_color = color;}

    //public String toString(){ return "0";}
    public double getArea(){
        double area = _radius*_radius*Math.PI;
        return area;
    }

    private double _radius;
    private String _color;


}
