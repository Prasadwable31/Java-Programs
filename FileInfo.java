import java.io.*;

class FileInfo
{
    public static void main(String a[]) throws IOException
    {

        File obj = new File("C:\\Users\\swami\\Desktop\\New folder\\Java\\File Handling\\Prasad.txt");

        if(obj.exists())
        {
            System.out.println("File Name : "+obj.getName());
            System.out.println("File Location : "+obj.getAbsolutePath());
            System.out.println("File Writable : "+obj.canWrite());
            System.out.println("File Readable : "+obj.canRead());
            System.out.println("File Size : "+obj.length());
            System.out.println("File Removed : "+obj.delete());
        }
        else
        {
            System.out.println("File doesn't Exisit...!");
        }

    }
}