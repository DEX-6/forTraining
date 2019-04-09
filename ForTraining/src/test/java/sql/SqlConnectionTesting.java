package sql;

import org.junit.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SqlConnectionTesting {
    @Test
    public void sqlConnectionTesting() throws SQLException, ClassNotFoundException, IllegalAccessException, InstantiationException {
        String url = "jdbc:mysql://localhost/test?verifyServerCertificate=false"+
                "&useSSL=false"+
                "&requireSSL=false"+
                "&useLegacyDatetimeCode=false"+
                "&amp"+
                "&serverTimezone=UTC";
        String user = "root";
        String pass = "";
//        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/addressbook?user=root&password=nbaser");
        Connection conn = DriverManager.getConnection(url, user, pass);
        conn.close();
    }
}
