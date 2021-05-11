import java.sql.*;

public class Example1 {
    public static void main(String[] args) {
        try {
            //1. Load the driver class
            Class.forName("oracle.jdbc.driver.OracleDriver");

            //2. Create the connection
            Connection con = DriverManager.getConnection(
                    "jdbc:oracle:thin:@localhost:1521:xe", "system", "password");

            //3. Create Statement Object
            Statement stmt = con.createStatement();

            //4. Execute Query
            ResultSet rs = stmt.executeQuery("select * from emp");
            while (rs.next()) {
                for (int i = 1; i <= rs.getMetaData().getColumnCount(); i++) {
                    System.out.printf("%-10s", rs.getString(i));
                }
                System.out.println();
            }
            //5. Close the connection
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}