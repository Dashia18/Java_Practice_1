/**
 * Created by dbobkova on 12.10.2016.
 */
public class Rectangle {
    public  Rectangle(){
        _length = 1.0f;
        _width = 1.0f;
    }
    public Rectangle(float length){
        setLength(length);
        _width = 1.0f;
    }
    public Rectangle(float length, float wigth){
        setLength(length);
        setWight(wigth);
    }

    public float getLength(){return _length;}
    public float getWight(){return _width;}

    public void setLength(float length){ _length = length;}
    public void setWight(float width){ _width = width;}

    public double getArea(){
        double area = _length * _width;
        return  area;
    }
    public double getPerimeter(){
        double perimeter = 2 * (_length + _width);
        return  perimeter;
    }

    //public String toString(){ return "0";}

    private  float _length;
    private  float _width;
}
