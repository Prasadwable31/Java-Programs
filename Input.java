import java.util.*;
// import java.util.Scanner;

class Input
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);
        int iNo1 = 0, iNo2 = 0;
        int iAns = 0;

        System.out.println("Enter first number : ");
        iNo1 = sobj.nextInt();                                          // nextInt = non static method

        System.out.println("Enter second number : ");
        iNo2 = sobj.nextInt();        

        iAns = iNo1 + iNo2;

        System.out.println("Addition is : "+iAns);
    }
}



/*
----------------------------------------------
Methods of Scanner class
----------------------------------------------
boolean             nextBool()
byte                nextByte()
char                nextLine()      // String
int                 nextInt()
float               nextFloat()
double              nextDouble()
short               nextShort()
long                nextLong()

----------------------------------------------

Oracal.com Java documentation
*/