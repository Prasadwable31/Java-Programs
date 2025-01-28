
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

class DerivedX extends Base
{
    public void sun()
    {
        System.out.println("Inside sun function");
    }
}

class Hierachalinheritance
{
    public static void main(String arr[])
    {
        
        Base bobj = new Base();
        bobj.fun();

        Derived dobj = new Derived();
        dobj.fun();
        dobj.gun();

        DerivedX dobjx = new DerivedX();

        dobjx.fun();
        dobjx.sun();

    }
}