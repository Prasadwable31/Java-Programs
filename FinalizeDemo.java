
class Demo
{
    int Size;
    int Arr[];

    public Demo(int No)
    {
        System.out.println("Inside Constructor");
        Size = No;
        Arr = new int[Size];
    }

    protected void finalize()
   {
        System.out.println("Inside Finalize method");
        Arr = null;
   }
}

class FinalizeDemo
{
    public static void main(String a[])
    {
        Demo obj = new Demo(4);                         // teva garbage collector asel may be    garbage vala alla teva
        obj = null;                                 // unreference obj now                    v4 rat nhi garbage uchalnara
        System.gc();                    // explicitly call to Garbage Collector             call kela watchman la
                                                    // gc = static 
    }
}