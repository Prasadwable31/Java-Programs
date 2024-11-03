// Constructor&Destructor


class Demo
{
    // Constructor
    public Demo()
    {
        System.out.println("Inside constructor of Demo");
    }
    // Instance block will exectue befor constructor
    {
        System.out.println("Inside constructor of Demo1");
    }

    // There is no Destructor in java
}

class Constructor_Destructor
{
    // Constructor
    Constructor_Destructor()
    {
        System.out.println("Inside constructor of Constructor_Destructor");
    }

    // There is no Destructor in java

    public static void main(String a[])
    {
        // Constructor Calling in Java
        Constructor_Destructor aobj = new Constructor_Destructor();
        Demo dobj = new Demo();
    }
}