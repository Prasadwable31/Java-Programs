import java.util.Scanner;

class ArrayX
{
    public int Arr[];
    public int iSize;

    public ArrayX(int No)
    {
        this.iSize = No;
        this.Arr = new int[iSize];
    }
    public void Accept()
    {
        System.out.println("Enter the elements : ");
        for(int iCnt = 0; i < iSize; iCnt++)
        {
            Arr[iCnt] = sobj.nextInt();
        }
    } 

    public void Display()
    {
        for(int iCnt = 0; i < iSize; iCnt++)
        {
            System.out.println(Arr[iCnt]);
        }
    }

    public void Addition()
    {
        iSum = 0;
           for(int iCnt = 0; i < iSize; iCnt++)
        {
            iSum = iSum + Arr[iCnt];
        }
        return iSum;
    }
}

class ArrayOOP
{
    public static void main(String arg[])
    {
        ArrayX obj1 = new ArrayX(5);
        obj1.Accept();
        obj1.Display();

        int iRet = obj1.Addition();
        System.out.println("Addition is : "+iRet);
    }
}