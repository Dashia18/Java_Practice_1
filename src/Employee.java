/**
 * Created by Daria Serebryakova on 12.10.2016.
 */
public class Employee {
    public Employee(int id, String firstName, String lastName, int salary) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    public int getID() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getName() {
        String name = firstName + " " + lastName;
        return name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getAnnualSalary() {
        int annualSalary = salary * 12;
        return annualSalary;
    }

    public int raiseSalary(int percent) {
        int newSalary = salary + (salary * percent) / 100;
        setSalary(newSalary);
        return newSalary;
    }


    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + firstName +
                " " + lastName + '\'' +
                ", salary=" + salary +
                '}';
    }

    private int id;
    private  String firstName;
    private  String lastName;
    private int salary;
}
