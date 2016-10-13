/**
 * Created by dbobkova on 13.10.2016.
 */
public class MyPoint {
    public MyPoint(){
        _x = 0;
        _y = 0;
    }
    public MyPoint(int x, int y){
        setX(x);
        setY(y);
    }
    public int getX(){ return _x;  }
    public int getY(){ return _y;  }
    public void setX(int x){  _x = x;   }
    public void setY(int y){  _y = y;   }

    private int _x;
    private int _y;
}
