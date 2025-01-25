
class GenericMethod
{
    public <T> void Display(T Arr[])
    {
        for(int i = 0; i<Arr.length; i++)
        {
            System.out.print(Arr[i]+" ");
        }
    }

    public static void main(String arr[])
    {
        
        GenericMethod obj = new GenericMethod();
        
        Integer iArr[] = {10,20,30,40};
        obj.Display(iArr);

            System.out.println();

        Float fArr[] = {10.1f, 20.2f, 30.3f};
        obj.Display(fArr);

            System.out.println();


        Character cArr[] = {'A', 'B', 'C', 'D'};
        obj.Display(cArr);

            System.out.println();

    }
}