package qlnhanviendh;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connect_mysql {
    public static Connection connect_mysql() {
        Connection conn = null;
        try {
            String url = "jdbc:mysql://localhost:3306/QLNhanVien";
            String user = "root";
            String password = "123456";
            conn = DriverManager.getConnection(url, user, password);
        } catch (SQLException e) {
            System.out.println(e);
        }
        return conn;
    }
}