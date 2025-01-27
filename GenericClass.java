
class Demo <T>
{
    public void Display(T no1, T no2)
    {
        System.out.print(no1);
        System.out.println(no2);
    }
}

class GenericClass
{
    public static void main(String arr[])
    {

        Demo <Integer> obj1 = new Demo<Integer>();
        obj1.Display(10,20);
        
        Demo <Float> obj2 = new Demo<Float>();
        obj2.Display(10.1f,20.2f);
        
        Demo <Character> obj3 = new Demo<Character>();
        obj3.Display('A','B');

    }
}