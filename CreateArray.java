import java.util.*;

class Demo
{
    public int Size;
    public int Arr[];
    
    Scanner sobj = new Scanner(System.in);

    public Demo(int no)
    {
        // System.out.println("Inside Default Constructor");

        // this.Size = no;              // this keyword is optional
        this.Arr = new int[no];        // this keyword is optional
    
    }
    
    public void Array()
    {
        System.out.println("Enter the array elements : ");
        for(int i = 0; i<Arr.length; i++)
        {
            Arr[i] = sobj.nextInt();
        }
    }
    public void Display()
    {
        System.out.println("Array Elements are : ");
        for(int i = 0; i<Arr.length; i++)
        {
            System.out.println(Arr[i]);
        }
    }
}

class CreateArray
{
    public static void main(String a[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter the size of array : ");
        int size = sobj.nextInt();

        Demo obj = new Demo(size);   

        obj.Array();
        obj.Display();

    }
}