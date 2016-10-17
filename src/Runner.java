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

        //Author
        Author firstAuthor = new Author("Bruce Eckel", "bruce.eckel@gmail.ru", 'm');
        Author secondAuthor = new Author("Stiv Macconnell", "stiv.macconnell@gmail.ru", 'm');
        Author[] authors = {firstAuthor, secondAuthor};

        //Book
        Book firstBook = new Book("Java",authors , 999.99);
        System.out.print(firstBook.toString());
        System.out.print("\n");
        System.out.print(firstBook.getAuthorNames());
        System.out.print("\n");

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
