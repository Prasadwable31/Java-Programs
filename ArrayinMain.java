import java.util.Scanner;

class ArrayinMain
{
    public static void main(String a[])
    {
        Scanner obj = new Scanner(System.in);

        System.out.print("Enter the size of array : ");
        int size = obj.nextInt();

        int Arr[] = new int[size];

        System.out.print("Enter the elements of array : ");
        for(int i = 0; i<size; i++)
        {
            Arr[i] = obj.nextInt();
        }

        System.out.println("Elements of array are : ");
        for(int i = 0; i<size; i++)
        {
            System.out.println(Arr[i]);
        }
        

    }
}