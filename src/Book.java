/**
 * Created by dbobkova on 12.10.2016.
 */
public class Book {
    public Book(String name, Author[] authors, double price){
        _name = name;
        _authors =  authors;
        _price = price;
    }

    public Book(String name, Author[] authors, double price, int gty){
        _name = name;
        _authors =  authors;
        _price = price;
        _gty = gty;

    }

    public String getName(){return _name;}
    //public Author[] getAuthors(){     //return 0;  //}

    public double getPrice(){return  _price;}
    public void setPrice(double price){ _price = price;}
    public int getQty(){ return _gty;}
    public void setQty(int qty){ _gty = qty;}
    //public String toString(){ return "0";}
    //public String getAuthorNames(){}


    private String _name;
    private Author[] _authors;
    private double _price;
    private int _gty;
}
