
class Arraytypes
{
    public static void main(String a[])
    {
        
        // 1.Single-Dimensional Array
        int Arr1[];

        int Arr2[] = {1,2,3,4,5};

        int Arr3[] = new int[5];                // dynamic memory allocation
        Arr3[0] = 10;
        Arr3[1] = 20;
        Arr3[2] = 30;
        Arr3[3] = 40;
        Arr3[4] = 50;

        int Arr4[] = new int[] {1,2,3,4,5};     // dynamic memory with inisilization


        // 2.Multi-Dimensional Array
        int Arr5[][] = {{1,2,3}, {4,5,6}, {7,8,9}};  
        // Size of each array are * same * in Multi-Dimensional Array (INSIDE ARRAY)


        // 3.Jagged Array
        int Arr6[][] = {{1,2,3}, {1,2,3,4,5}, {1}, {1,2}};
        // Size of each array are * Different * in Jagged Array (INSIDE ARRAY)

    }
}