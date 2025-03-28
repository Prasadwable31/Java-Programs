
class Base
{
    public void fun()
    {
        System.out.println("Inside fun function");
    }
}

class Derived extends Base
{
    public void gun()
    {
        System.out.println("Inside gun function");
    }
}

class DerivedX extends Derived
{
    public void sun()
    {
        System.out.println("Inside sun function");
    }
}

class Multilevelinheritance
{
    public static void main(String arr[])
    {
        
        DerivedX obj = new DerivedX();

        obj.fun();
        obj.gun();
        obj.sun();

    }
}