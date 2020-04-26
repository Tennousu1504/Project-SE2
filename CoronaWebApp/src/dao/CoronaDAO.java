package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import connect.DBConnect;
import model.Corona;

public class CoronaDAO {
	public CoronaDAO() {
	}

	public List<Corona> selectAllCoronas() {
		List<Corona> coronas = new ArrayList<>();
		// Step 1: Establishing a Connection
		Connection connection = DBConnect.getConnection();
		try {
			// Step 2:Create a statement using connection object
			String SELECT_ALL_PATIENTS = "SELECT * FROM corona2020";
			PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_PATIENTS);
			// Step 3: Execute the query or update query
			ResultSet rs = preparedStatement.executeQuery();
			// Step 4: Process the ResultSet object
			while (rs.next()) {
				String iso_code = rs.getString("iso_code");
				String location= rs.getString("location");
			    String date = rs.getString("date");
				String total_cases=rs.getString("total_cases");
				coronas.add(new Corona(iso_code,location,date,total_cases));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return coronas;
	}
	
}
