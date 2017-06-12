package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MyDatabase {
	public static void main(String[] args) {
		String url = "jdbc:mysql://127.0.0.1:3306/okul";
		try {
			Connection con = DriverManager.getConnection(url, "root", "hilal2603");
			if (con != null)
				System.out.println("baglandý");

			String SQL = "SELECT *FROM OGRENCI";
			Statement statement = con.createStatement();
			ResultSet rs = statement.executeQuery(SQL);
			while (rs.next()) {
				int id = rs.getInt("id");
				String name = rs.getString("name");
				System.out.println("id:"+id+" name:"+name);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
