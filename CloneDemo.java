
import java.lang.*;

class Employee implements Cloneable
{
    public int Eid;
    public String Name;
    public int Salary;

    public Employee(int No, String str, int Value)
    {
        this.Eid = No;
        this.Name = str;
        this.Salary = Value;
    }

    public Object clone() throws CloneNotSupportedException
    {
        return super.clone();
    }
}

class CloneDemo
{
    public static void main(String a[])
    {
        try
        {
        Employee eobj1 = new Employee(101,"Rahul",11000);
        Employee eobj2 = (Employee)eobj1.clone();

        System.out.println("Name of first employee : "+eobj1.Name);
        System.out.println("Name of Second employee : "+eobj2.Name);

        System.out.println("Salary of first Employee is : "+eobj1.Salary);
        System.out.println("Salary of second Employee is : "+eobj2.Salary);
        
        eobj1.Name = "Sagar";               // clone method internally contain deep copy
        
        System.out.println("Name of first employee : "+eobj1.Name);
        System.out.println("Name of second employee : "+eobj2.Name);
        }

        catch(CloneNotSupportedException obj)
        {}
    }
}