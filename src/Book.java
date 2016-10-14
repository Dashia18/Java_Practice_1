import java.util.Arrays;

/**
 * Created by Daria Serebryakova on 12.10.2016.
 */
public class Book {
    public Book(String name, Author[] authors, double price){
        this.name = name;
        this.authors =  authors;
        this.price = price;
    }

    public Book(String name, Author[] authors, double price, int gty){
        this.name = name;
        this.authors =  authors;
        this.price = price;
        this.gty = gty;

    }

    public String getName(){return name;}
    //public Author[] getAuthors(){     //return 0;  //}

    public double getPrice(){return  price;}
    public void setPrice(double price){ this.price = price;}
    public int getQty(){ return gty;}
    public void setQty(int qty){ this.gty = qty;}

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", authors=" + Arrays.toString(authors) +
                ", price=" + price +
                ", gty=" + gty +
                '}';
    }
//public String getAuthorNames(){}


    private String name;
    private Author[] authors;
    private double price;
    private int gty;
}
