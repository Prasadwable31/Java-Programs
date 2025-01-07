
import java.util.*;

class Excp_Divide_by_Zero
{
    public static void main(String arr[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter the 1 no : ");
        int a = sobj.nextInt();

        System.out.print("Enter the 2 no : ");
        int b = sobj.nextInt();


        try
        {
            int c = a / b;
        
            System.out.println("Division is : "+c);
        }
        catch(Exception obj)
        {
            System.out.println(obj);
        }
    }
}