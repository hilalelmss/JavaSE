package jdbc.okul.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public abstract class DAO {
	
	public final String URL = "jdbc:mysql://127.0.0.1:3306/okul";
	public final String userName = "root";
	public final String password = "hilal2603";

	public Connection createCon() {
		Connection con = null;
		try {
			con = DriverManager.getConnection(URL, userName, password);
			if (con != null)
				System.out.println("baðlandý");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return con;

	}
}
