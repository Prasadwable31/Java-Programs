
abstract class Base                
{
    public Base()               // Inside abstract class we can also a write Constructor
    {
        System.out.println("Inside Constructor");
    }

    public int gun(int No1, int No2)                // Inside abstract we can also create Concrete method
    {
        return No1 + No2;
    }

    public abstract int fun(int No1, int No2);              // abstract method
}

class Derived extends Base
{
    public int fun(int No1, int No2)
    {
        int C = No1 + No2;
        return C;
    }
}

class Abstract_Class
{
    public static void main(String a[])
    {

        // Base bobj = new Base();              // Because Base is abstract we cant create its object
        
//----------------------------------------------------------------------------------------------->        
            int Ret = 0;

        Derived dobj = new Derived();       // Derived cha object

        Ret = dobj.gun(10, 00);
        System.out.println(Ret);
        
        Ret = dobj.fun(10, 10);
        System.out.println(Ret);

//----------------------------------------------------------------------------------------------->

        Base bdobj = new Derived();              // Upcasting is also allowed here
        
        Ret = bdobj.gun(20, 10);
        System.out.println(Ret);
        
        Ret = bdobj.fun(20, 20);
        System.out.println(Ret);

    }
}