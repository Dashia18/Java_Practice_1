/**
 * Created by dbobkova on 12.10.2016.
 */
public class Runner {
    public static void main(String[] args) {

        //Circle
        Circle littleCircle = new Circle(15,"blue");
        //System.out.print(littleCircle.getRadius());
        //System.out.print("\n");
        //System.out.print(littleCircle.getColor());
        //System.out.print("\n");
        double areaCircle = littleCircle.getArea();
        //System.out.print("Area of the circle = ");
        //System.out.print(areaCircle);
        //System.out.print("\n");


        //Rectangle
        Rectangle littleRectangle = new Rectangle(2,3);
        //System.out.print(littleRectangle.getLength());
        //System.out.print("\n");
        //System.out.print(littleRectangle.getWight());
        //System.out.print("\n");
        double areaRectangle = littleRectangle.getArea();
        //System.out.print("Area of the rectangle = ");
        //System.out.print(areaRectangle);
        //System.out.print("\n");
        double perimeterRectangle = littleRectangle.getPerimeter();
        //System.out.print("Perimeter of the rectangle = ");
        //System.out.print(perimeterRectangle);
        //System.out.print("\n");


        //Employee
        Employee firstEmployee = new Employee(1,"Daria", "Serebriakova", 1000);
        //System.out.print(firstEmployee.getName());
        //System.out.print("\n");
        //System.out.print(firstEmployee.getAnnualSalary());
        //System.out.print("\n");
        int newSalary = firstEmployee.raiseSalary(10);
        //System.out.print(newSalary);
        //System.out.print("\n");
        //System.out.print(firstEmployee.getAnnualSalary());
        //System.out.print("\n");

        //Book
        //Book firstBook = new Book("Java",{"Bruce Eckel","Stiv Makkonnell"}, 999.99);


    }



}
