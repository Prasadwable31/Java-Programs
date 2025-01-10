
// Final class
final class Base                
{
    public void fun()
    {
        System.out.println("Base fun");
    }

}

// We can't inherite/extends final class
class Derived // extends Base                       
{
    public void gun()
    {
        System.out.println("Derived gun");
    }
}

class Final_Class
{
    public static void main(String a[])
    {       

        Base bobj = new Base();             // Base cha object
        bobj.fun();
//---------------------------------------------------------------------------------->
        Derived dobj = new Derived();       // Derived cha object
        dobj.gun();
//---------------------------------------------------------------------------------->
        // Base bdobj = new Derived();              // We cannot make Upcasting here.
        // bdobj.fun();
        // bdobj.gun();

    }
}