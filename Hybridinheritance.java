
class Base
{
    public void fun()
    {
        System.out.println("Inside fun function");
    }
}

class Derived1 extends Base
{
    public void gun()
    {
        System.out.println("Inside gun function");
    }
}

class Derived2 extends Derived1
{
    public void sun()
    {
        System.out.println("Inside sun function");
    }
}

class Derived extends Derived1
{
    public void run()
    {
        System.out.println("Inside run function");
    }
}

class Hybridinheritance
{
    public static void main(String arr[])
    {
        
        Derived2 bobj = new Derived2();
        bobj.fun();
        bobj.gun();
        bobj.sun();

        Derived dobj = new Derived();
        dobj.fun();
        dobj.gun();
        dobj.run();

    }
}