
class Base
{
    int A = 0;
    public Base(int a)
    {
        this.A = a;
        System.out.println(A);
    }
}

class Derived extends Base
{
    int B = 0;
    public Derived(int X, int Y)
    {
        super(X);
        this.B = Y;

        System.out.println(B);
        System.out.println(super.A);
    }
}

class Super_constructor
{
    public static void main(String a[])
    {

        Derived obj = new Derived(10,20);

    }
}