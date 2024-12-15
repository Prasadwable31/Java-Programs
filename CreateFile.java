import java.io.*;

class CreateFile
{
    public static void main(String a[]) throws IOException
    {

        File obj = new File("C:\\Users\\swami\\Desktop\\New folder\\Java\\File Handling\\Prasad.txt");

        if(obj.createNewFile())
        {
            System.out.println("File Succssfully Created");
        }
        else
        {
            System.out.println("File Already Exisit...!");
        }

    }
}