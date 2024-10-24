import java.io.*;

class Wrapper
{
    public static void main(String A[])                        
    {
       int no = 11;

       Integer iboj = new Integer(no);          // Boxing = converting premitive to wrapper 

       System.out.println(no);
       System.out.println(iboj);

       int X = iboj;                                // Unboxing = converting wrapper to premitive
       System.out.println(X);
        
    }
}