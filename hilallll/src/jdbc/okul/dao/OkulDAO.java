package jdbc.okul.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import jdbc.okul.entity.Ogrenci;

public class OkulDAO extends DAO {

	public List<Ogrenci> read(String SQL) {
		List<Ogrenci> ogrenciList = new ArrayList<>();
		Connection con = createCon();
		Statement statement = null;
		ResultSet resultSet = null;
		try {
			statement = con.createStatement();
			resultSet = statement.executeQuery(SQL);
			while (resultSet.next()) {
				int id = resultSet.getInt("id");
				String name = resultSet.getString("name");
				Ogrenci ogrenci = new Ogrenci(id, name);
				ogrenciList.add(ogrenci);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return ogrenciList;

	}

	public void insert(String SQL) {

	}

	public void update(String SQL) {

	}

	public void create(String SQL) {

	}

	public void delete(String SQL) {

	}
}
