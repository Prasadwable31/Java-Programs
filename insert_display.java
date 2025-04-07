import java.sql.*;
import java.util.*;

class insert_display
{
    public static void main(String arr[]) throws Exception
    {

        Scanner sc = new Scanner(System.in);

        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/JDBC","root","");

        String Query1 = "insert into sample values(?,?)";

        PreparedStatement s1 = con.prepareStatement(Query1);
        
        System.out.print("Enter the Roll no : ");
        int roll = sc.nextInt();

        System.out.print("Enter the Name : ");
        String name = sc.next();

        s1.setInt(1,roll);
        s1.setString(2,name);
            
        s1.executeUpdate();
        

        System.out.println("Values Entered Successfully !");


        String Query2 = "Select * from sample";

        PreparedStatement s2 = con.prepareStatement(Query2);

        ResultSet rs = s2.executeQuery();

        System.out.println("\nData in Table is : ");

        while(rs.next())
        {
            System.out.println("Roll No : "+rs.getInt(1));
            System.out.println("Name : "+rs.getString(2));
        }

    }
}