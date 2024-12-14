import java.util.*;

class Demo
{

    Scanner sobj = new Scanner(System.in);

    public int Cube()
    {    
        System.out.print("Enter the Number : ");
        int b = sobj.nextInt();

        int Cube = b * b * b;
        return Cube;
    }
}

class Cube
{
    public static void main(String a[])
    {
        int Ret = 0;
        Demo obj = new Demo();   

        Ret = obj.Cube();
        System.out.println("Cube is : "+Ret);

    }
}