package testConnection;

import java.sql.Connection;
import java.sql.DriverManager;

public class TestJdbc {
    public static void main(String[] args)
    {
        String jdbcUrl = "jdbc:mysql://localhost:3306/hb_student_tracker?useSSL=false&serverTimezone=UTC";
        String user = "hbstudent";
        String password = "hbstudent";
        try
        {
            // connect to MySQL
            System.out.println("Connecting to DB: " + jdbcUrl);
            Connection myConnection = DriverManager.getConnection(jdbcUrl, user, password);
            //put password
            System.out.println("Connection success");
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
