
import java.sql.*;

class Database
{
    public static void main(String a[]) throws Exception
    {
        try
        {
        // Class.forName("com.mysql.jdbc.Driver");

         Connection cobj = DriverManager.getConnection("jdbc:mysql://localhost:3306/PPA41","root","");

        // String Query = "select * from student";

        Statement sobj = cobj.createStatement();

        ResultSet robj = sobj.executeQuery("select * from student");

        while(robj.next())
        {
            System.out.println("RID : "+robj.getInt(1));        // Always give column numbers
            System.out.println("Name : "+robj.getString(2));
            System.out.println("Marks : "+robj.getInt(3));
            System.out.println("City : "+robj.getString(4));

        }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}