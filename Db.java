import java.sql.*;

class Db
{
    public static void main(String arr[]) throws Exception
    {
        Connection con = null;
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/JDBC","root","");

            System.out.println("Xampp conneted");

            Statement stat = con.createStatement();
            stat.executeUpdate("create database hello");
            System.out.println("database created...");

        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}