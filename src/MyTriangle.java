/**
 * Created by dbobkova on 13.10.2016.
 */
public class MyTriangle {
    public MyTriangle(int x1, int y1, int x2, int y2, int x3, int y3){
        _v1.setXY(x1, y1);
        _v2.setXY(x2, y2);
        _v3.setXY(x3, y3);
    }
    public MyTriangle(MyPoint v1, MyPoint v2, MyPoint v3){
        _v1.setXY(v1.getX(), v1.getY());
        _v2.setXY(v2.getX(), v2.getY());
        _v3.setXY(v3.getX(), v3.getY());
    }

    public String toString(){
        return "MyTriangle [v1 = (" + _v1.getX() + ", " + _v1.getY()+ "), v2 = (" +  _v2.getX() + ", " + _v2.getY()+ "), v3 = (" + _v3.getX() + ", " + _v3.getY() + ") ]";
    }

    public double getPerimeter(){
        double perimeter = _v1.distance(_v2) + _v2.distance(_v3) + _v3.distance(_v1);//P = a + b + c
        return perimeter;
    }
    public String getType(){
        String type = "0";//Equilateral, Isosceles, Scalene
        double a = _v1.distance(_v2);
        double b = _v2.distance(_v3);
        double c = _v3.distance(_v1);
        if ((a == b) && (b == c) )
        {
            type = "Equilateral";
        }
        else if ((a == b) || (b == c))
        {
            type = "Isosceles";
        }
        else
        {
            type = "Scalene";
        }

        return type;
    }


    private MyPoint _v1;
    private MyPoint _v2;
    private MyPoint _v3;
}
