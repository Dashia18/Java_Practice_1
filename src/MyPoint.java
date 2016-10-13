/**
 * Created by dbobkova on 13.10.2016.
 */
public class MyPoint {
    public MyPoint(){
        _x = 0;
        _y = 0;
    }
    public MyPoint(int x, int y){
        setXY(x, y);
    }
    public int getX(){  return _x;  }
    public int getY(){  return _y;  }
    public void setX(int x){    _x = x;   }
    public void setY(int y){    _y = y;   }

    public int[] getXY() {
        int[] points = new int[]{_x, _y};
        return  points;
    }
    public void setXY(int x, int y){
        setX(x);
        setY(y);
    }
    public String toString(){
        return "point (" + _x + ", " + _y + ")";
    }

    public double distance(int x, int y){
        double d = Math.sqrt(Math.pow((_x - x),2) + Math.pow((_y - y),2));
        return d;
    }
    public double distance(MyPoint another){
        double d = distance(another._x,  another._y);
        return d;
    }
    public double distance(){
        double d = distance(0, 0);
        return d;
    }

    private int _x;
    private int _y;
}
