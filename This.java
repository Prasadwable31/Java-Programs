
class Demo
{
    private int A;

    public void fun(int A)
    {
        this.A = A;
        System.out.println(A);
    }
}

class This
{
    public static void main(String arr[])
    {
        
        Demo obj = new Demo();

        obj.fun(11);

    }
}