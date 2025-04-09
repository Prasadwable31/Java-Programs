import java.sql.*;
import java.util.*;

class insert_display1
{
    public static void main(String arr[]) throws Exception
    {

        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/JDBC","root","");

        String Query1 = "insert into sample values(?,?)";

        PreparedStatement sobj = con.prepareStatement(Query);

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

            sobj.setInt(1,roll);
            sobj.setString(2,name);
             
            sobj.executeUpdate();
            
            i++;
        }


        System.out.println("Values Entered Successfully !");


        String Query2 = "Select * from sample";

        PreparedStatement s = con.prepareStatement(str);

        ResultSet r = s.executeQuery();

        System.out.println("Data in Table is : ");

        while(r.next())
        {
            System.out.println("Roll No : "+r.getInt(1));
            System.out.println("Name : "+r.getString(2));
        }

    }
}