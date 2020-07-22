package it.enaip.cinema;
import java.sql.Connection;
import java.sql.DriverManager;
public class DataSource {
    public static Connection getConnection() {
        Connection conn = null;

        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");

            conn = DriverManager.getConnection(
                    "jdbc:oracle:thin:@localhost:1521:xe",
                     "otto",
                     "otto"
            );
        } catch (Exception e) {
        	throw(new RuntimeException(e));
        }

        return conn;

    }
}

