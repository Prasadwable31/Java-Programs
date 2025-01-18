
class Demo
{
    public void fun()
    {
        System.out.println("Fun method without parameter");
    }

    public void fun(int a)
    {
        System.out.println("Fun method with 1 parameter");
    }

    public void fun(int a, int b)
    {
        System.out.println("Fun method with 2 parameter");
    }

    public void fun(float a)
    {
        System.out.println("Fun method with 1 float parameter");
    }

    public void fun(int a, float b)
    {
        System.out.println("Fun method with 1 integer and 1 floating parameter");
    }
}

class Fun_Overloading
{
    public static void main(String a[])
    {

        Demo obj = new Demo();

        obj.fun();
        obj.fun(11);
        obj.fun(11,21);
        obj.fun(1.1f);
        obj.fun(11,1.1f);

    }
}