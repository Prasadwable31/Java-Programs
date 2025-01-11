
class Base
{
    public void fun()
    {
        System.out.println("Base fun");
    }

/*
    public final void gun()
    {
        System.out.println("Base gun");
    }
*/

}

class Derived extends Base
{
    public void fun()
    {
        System.out.println("Base fun");
    }

    public void gun()
    {
        System.out.println("Base gun");
    }
}

class Final_method
{
    public static void main(String a[])
    {       
        
        Base obj = new Derived();

    }
}