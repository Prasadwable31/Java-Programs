import java.sql.*;
import java.util.*;

class insertquery
{
    public static void main(String arr[]) throws Exception
    {

        try
        {

        Connection cobj = DriverManager.getConnection("jdbc:mysql://localhost:3306/JDBC","root","");

        String Query = "insert into emp values(?,?,?)";

        PreparedStatement sobj = cobj.prepareStatement(Query);

        // ResultSet robj = sobj.executeQuery("select * from student");

        Scanner sc = new Scanner(System.in);

        int i = 0;
        System.out.print("Enter the Number of Queries you want enter : ");
        int No = sc.nextInt();

        while(i < No)
        {
            System.out.print("Enter the Roll no : ");
            int roll = sc.nextInt();

            System.out.print("Enter the Name : ");
            String name = sc.next();

            System.out.print("Enter the Age : ");
            int age = sc.nextInt();

            sobj.setInt(1,roll);
            sobj.setString(2,name);
            sobj.setInt(3,age);
             
            sobj.executeUpdate();
            
            i++;
        }


        System.out.print("Values Entered Successfully !");

        }
        catch(Exception e)
        {
            System.out.println(e);
        }

    }
}