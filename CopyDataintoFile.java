// Copy Data Form one file to another

import java.io.*;

class CopyDataintoFile
{
    public static void main(String a[]) throws IOException
    {

        FileInputStream obj1 = new FileInputStream("C:\\Users\\swami\\Desktop\\New folder\\Java\\File Handling\\1.txt");
        FileOutputStream obj2 = new FileOutputStream("C:\\Users\\swami\\Desktop\\New folder\\Java\\File Handling\\2.txt");

        int i;
        while((i = obj1.read())!=-1)
        {
            obj2.write((char)i);
        }

        System.out.println("Data Copied Successfully...!");

    }
}