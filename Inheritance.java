
class Base
{
    public int no1;

    public void fun()
    {
        System.out.println("Base Fun");
    }

    public void gun()
    {
        System.out.println("Base Gun");
    }

}

class Derived extends Base
{
    public int no2;

    public void fun()
    {
        System.out.println("Derived Fun");
    }

    public void sun()
    {
        System.out.println("Derived sun");
    }

}

class Inheritance
{
    public static void main(String a[])
    {

        System.out.println("Hello world");

        Base bobj = new Base();                         // Base cha object
        bobj.fun();         // Base fun
        bobj.gun();         // Base gun
        // bobj.sun();                              // Error  because there is not sun method in Base class

        Derived dobj = new Derived();                   // Derived cha object
        dobj.fun();         // Derived fun
        dobj.gun();         // Base gun
        dobj.sun();         // Derived sun

        Base bdobj = new Derived();                     // Upcasting
        bdobj.fun();        // Derived fun
        bdobj.gun();        // Base gun
        // bdobj.sun();                             // Error  because there is not sun method in Base class

    }
}