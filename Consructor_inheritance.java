
class Base
{
    public Base()
    {
        System.out.println("Inside Base Constructor");
    }
}

class Derived extends Base
{
    public Derived()
    {
        System.out.println("Inside Derived Constructor");
    }
}

class DerivedX extends Derived
{
    public DerivedX()
    {
        System.out.println("Inside DerivedX Constructor");
    }
}

class Consructor_inheritance
{
    public static void main(String a[])
    {

        // System.out.println("Hello world");
//-------------------------------------------------------------------------------------------        
        System.out.println("Base Object");
        Base bobj = new Base();                         // Base cha object
//-------------------------------------------------------------------------------------------        
        System.out.println("Derived Object");
        Derived dobj = new Derived();                   // Derived cha object
//-------------------------------------------------------------------------------------------        
        System.out.println("DerivedX Object");
        DerivedX dxobj = new DerivedX();                   // DerivedX cha object
//-------------------------------------------------------------------------------------------        
        System.out.println("Upcasting");
        Base bdobj = new DerivedX();                     // Upcasting
//-------------------------------------------------------------------------------------------

    }
}