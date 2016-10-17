/**
 * Created by Daria Serebryakova on 12.10.2016.
 */
public class Runner {
    public static void main(String[] args) {

        //Circle
        Circle littleCircle = new Circle(15,"blue");
        System.out.print(littleCircle.toString());
        System.out.print("\n");

        //Rectangle
        Rectangle littleRectangle = new Rectangle(2,3);
        System.out.print(littleRectangle.toString());
        System.out.print("\n");


        //Employee
        Employee firstEmployee = new Employee(1,"Daria", "Serebriakova", 1000);
        System.out.print(firstEmployee.toString());
        System.out.print("\n");

        //Book
        //Book firstBook = new Book("Java",{"Bruce Eckel","Stiv Makkonnell"}, 999.99);

        //MyPoint
        MyPoint littlePoint = new MyPoint(4, 2);
        System.out.print(littlePoint.toString());
        System.out.print("\n");

        //MyTriangle
        MyTriangle littleTriangle = new MyTriangle(1, 2, 5, 2, 5, 6);
        System.out.print(littleTriangle.toString());
        System.out.print("\n");

    }



}
