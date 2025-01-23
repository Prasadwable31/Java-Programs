
interface Demo
{
    int A = 10;                 // public static final int A = 10;

    void fun(int a);            // public abstract void fun(int a);
} 

interface Hello extends Demo
{
    int B = 20;                 // public static final int B = 20;

    void gun(int b);            // public abstract void gun(int b);
}

// class Derived implements Demo            // Derived class only Demo che method concrete karu shakate

class Derived implements Hello
{
    public void fun(int a)                      // Access specifier is must
    {
        System.out.println("Inside fun method of interface Demo");
    }
    
    public void gun(int b)                      // Access specifier is must
    {
        System.out.println("Inside gun method of interface Hello");
    }
}

class Interface
{
    public static void main(String a[])
    {

        System.out.println(Derived.A);                      // Because it is static
        System.out.println(Derived.B);

// -------------------------------------------------------------------------------------------------------->

        // Demo bobj = new Demo();               // We cannot create interface's object because it hase abstract method's

// -------------------------------------------------------------------------------------------------------->

        Demo bdobj = new Derived();               // Upacsting karu shakato

// --------------------------------------------------------------------------------------------------------->

        Derived obj = new Derived();

        obj.fun(11);
        obj.gun(11);

    }
}