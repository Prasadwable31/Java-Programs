
class Demo
{
    int A;

    public Demo()
    {
        System.out.println("Inside Default Constructor");
        A = 0;
    }
    public Demo(int a)
    {
        System.out.println("Inside Parametrised Constructor");
        A = a;
    }
    public Demo(Demo ref)
    {
        System.out.println("Inside Copy Constructor");
        A = ref.A;
    }
}

class ConstructorTypes
{
    public static void main(String arr[])
    {
        
        Demo obj1 = new Demo();
        System.out.println("Value of A in obj1 :"+obj1.A);

        Demo obj2 = new Demo(10);
        System.out.println("Value of A in obj2 :"+obj2.A);

        Demo obj3 = new Demo(obj2);
        System.out.println("Value of A in obj3 :"+obj3.A);

    }
}