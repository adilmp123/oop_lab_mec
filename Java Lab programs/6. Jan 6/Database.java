import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Database {
    public static void main(String args[]) {
        Connection c = null;
        Statement stmt = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            c = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "mec", "mec");
            c.setAutoCommit(false);
            System.out.println("Opened database successfully");
            stmt = c.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM student;");
            while (rs.next()) {
                int roll = rs.getInt("rollno");
                String name = rs.getString("name");
                int mark = rs.getInt("mark");
                System.out.println("ID = " + roll);
                System.out.println("NAME = " + name);
                System.out.println("MARK = " + mark);
                System.out.println();
            }
            rs.close();
            stmt.close();
            c.close();
        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " +
                    e.getMessage());
            System.exit(0);
        }
        System.out.println("Operation done successfully");
    }
}