import java.util.*;

class Fibonnace
{
    public static void main(String ar[])
    {

        Scanner obj = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int No = obj.nextInt();

            int a = 1, b = 0, c = 0;

        for(int i = 0; i<No; i++)
        {

            c = a + b;
            System.out.println(c);

            a = b; 
            b = c;

        }

    }
}