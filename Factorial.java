import java.util.*;

class Factorial
{
    public static void main(String ar[])
    {

        Scanner obj = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int No = obj.nextInt();

        int fact = 1;

        while(No>0)
        {
            fact = fact * No;
            No--;
        }

        System.out.println("The reverse number is : "+fact);

    }
}