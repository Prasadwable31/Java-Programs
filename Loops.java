
class A1
{
    public static void main(String arr[])
    {
        int i = 0;

        System.out.println("Print using for-loop ");
        for(i = 0; i<5; i++)
        {
            System.out.println(i);
        }

        i = 0;
        
        System.out.println("Print using while loop ");
        while(i<5)
        {
            System.out.println(i);
            i++;
        }

        i = 0;
        
        System.out.println("Print using do-while loop ");
        do
        {
            System.out.println(i);
            i++;
        }while(i<5);

    }
}