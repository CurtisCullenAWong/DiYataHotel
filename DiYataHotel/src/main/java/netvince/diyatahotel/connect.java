package netvince.diyatahotel;



import java.sql.*;

public class connect {

    public static final String url = "jdbc:mysql://localhost:3306/hms";
    public static final String user = "root";
    public static final String password = "";

    public static Connection getConnection() {
        Connection connection = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(url, user, password);
            return connection;
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }
}