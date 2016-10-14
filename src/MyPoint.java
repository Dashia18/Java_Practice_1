/**
 * Created by Daria Serebryakova on 13.10.2016.
 */
public class MyPoint {
    public MyPoint(){
        x = 0;
        y = 0;
    }
    public MyPoint(int x, int y){
        setXY(x, y);
    }

    public int getX(){  return this.x;  }
    public int getY(){  return this.y;  }
    public void setX(int x){    this.x = x;   }
    public void setY(int y){    this.y = y;   }

    public int[] getXY() {
        int[] points = new int[]{x, y};
        return  points;
    }
    public void setXY(int x, int y){
        setX(x);
        setY(y);
    }

    @Override
    public String toString() {
        return "MyPoint{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    public double distance(int x, int y){
        double d = Math.sqrt(Math.pow((this.x - x),2) + Math.pow((this.y - y),2));
        return d;
    }
    public double distance(MyPoint another){
        double d = distance(another.x,  another.y);
        return d;
    }
    public double distance(){
        double d = distance(0, 0);
        return d;
    }

    private int x;
    private int y;
}
