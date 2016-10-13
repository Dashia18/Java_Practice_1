/**
 * Created by dbobkova on 13.10.2016.
 */
public class MyTriangle {
    public MyTriangle(int x1, int y1, int x2, int y2, int x3, int y3){

    }
    public MyTriangle(MyPoint v1, MyPoint v2, MyPoint v3){

    }

    public String toString(){
        return "MyTriangle [v1 = " + _v1 + ", v2 = " + _v2 + ", v3 = " + _v3  + "]";
    }

    public double getPerimeter(){
        double perimeter = 0;//P = a + b + c
        return perimeter;
    }
    public String getType(){
        String type = "0";//Equilateral, Isosceles, Scalene
        return type;
    }


    private MyPoint _v1;
    private MyPoint _v2;
    private MyPoint _v3;
}
