
package data.driver;

import data.utils.Constants;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySQLDriver {

    public static Connection getConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(
                    Constants.DB_URL,
                    Constants.USER,
                    Constants.PASS
            );

            System.out.println("Ket noi MySQL thanh cong!");
            return con;

        } catch (ClassNotFoundException ex) {
            throw new RuntimeException("Khong tim thay MySQL JDBC Driver!", ex);

        } catch (SQLException ex) {
            throw new RuntimeException("Ket noi MySQL that bai!", ex);
        }
    }
}
