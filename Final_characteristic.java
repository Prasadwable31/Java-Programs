
class Demo
{
    public int No1 = 0;
    public final int No2;                   // final characteristic is as same as Constant characteristic in C++
    public final int No3 = 51;              // final characteristic is as same as Constant characteristic in C++

    public Demo()
    {
        No1 = 11;
        No2 = 21;           // we can initialised final charactreistic inside constructor
    }

    public void increment()
    {
        No1++;
        // No2++;                   // We cant change value of final variable throughout the program
        // No3++;                   // We cant change value of final variable throughout the program
    }

}

class Final_characteristic
{
    public static void main(String a[])
    {       
            final int A = 101;
            int B = 101;

        Demo obj = new Demo();

        obj.increment();

        // A++;             // Cant increnment.
        B++;

        System.out.println(obj.No1);
        System.out.println(obj.No2);
        System.out.println(obj.No3);
        System.out.println(A);
        System.out.println(B);

    }
}