/*@
 * @ Mamadou belly ngaido
 * 
 */
// class pour les données du manager pas tout a fait fonctionel


package Data;

import java.sql.*;
import javax.sql.*;

public class JdbcManager {
	private Connection conn;

	public Connection getConnection() throws SQLException, ClassNotFoundException {

		String url = "jdbc:postgresql://localhost:5432/AgenceLocation";
		String user = "postgres";
		String passwd = "root";

		Connection conn = DriverManager.getConnection(url, user, passwd);

		return conn;
	}

	public void close(Connection conn) {
		if (conn != null) {
			try {
				conn.close();
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		}
	}

	public void close(Statement stmt) {
		if (stmt != null) {
			try {
				stmt.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}