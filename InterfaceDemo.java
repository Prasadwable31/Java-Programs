// Interface is a blueprint of class which contain all abstract methos in it
// Interface achives 100% abstraction 

interface Circle
{
    float PI = 3.14f;                               // public static final float PI = 3.14f;

    float Area(float Radius);                       // public abstract float Area(float Radius);
    float Circumfarance(float Radius);              // public abstract float Circumfarance(float Radius);
}

class Marvellous implements Circle
{
    public float Area(float Radius)
    {
        return PI * Radius * Radius;
    }
    public float Circumfarance(float Radius)
    {
        return 2 * PI * Radius;
    }
}

class InterfaceDemo
{
    public static void main(String Arr[])
    {
        System.out.println("Value of PI is : "+Circle.PI);          // to demanstrate public and static
        // Circle.PI = 7.12f;                                       // to demanstrate final
        Circle cobj = new Marvellous();
        float Ret = 0.0f;
        Ret = cobj.Area(10.5f);
        System.out.println("Area is : "+Ret);
        Ret = cobj.Circumfarance(10.5f);
        System.out.println("Circumfarance is : "+Ret);

    }
}