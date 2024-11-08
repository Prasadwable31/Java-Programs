
class ArrayTraversal
{
    public static void main(String a[])
    {

        int Arr[] = {1,2,3,4,5};
        int i = 0;

        System.out.println("Elements traversal by for loop : ");
        for(i = 0; i<Arr.length; i++)
        {
            System.out.println(Arr[i]);
        }

        System.out.println("Elements traversal by while loop : ");
        i = 0;
        while(i < Arr.length)
        {
            System.out.println(Arr[i]);
            i++;
        }

        System.out.println("Elements traversal by do-while loop : ");
        i = 0;
        do
        {
            System.out.println(Arr[i]);
            i++;
        }while(i < Arr.length);
        
        System.out.println("Elements traversal by for-each loop : ");
        for(int No : Arr)
        {
            System.out.println(No);
        }

    }
}