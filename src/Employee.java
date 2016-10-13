/**
 * Created by dbobkova on 12.10.2016.
 */
public class Employee {
    public Employee(int id, String firstName, String lastName, int salary){
        _id = id;
        _firstName = firstName;
        _lastName = lastName;
        _salary = salary;
    }

    public int getID(){ return _id;}
    public String getFirstName(){ return  _firstName;}
    public String getLastName(){ return  _lastName;}
    public String getName(){
        String name = _firstName + " " + _lastName;
        return  name;
    }
    public int getSalary(){return _salary;}

    public void setSalary(int salary){ _salary = salary;}
    public int getAnnualSalary(){
        int annualSalary = _salary * 12;
        return  annualSalary;
    }
    public  int raiseSalary (int percent){
        int newSalary = _salary + (_salary * percent)/100;
        setSalary(newSalary);
        return newSalary;
    }


    //public String toString(){ return "0";}
    private int _id;
    private  String _firstName;
    private  String _lastName;
    private int _salary;
}
