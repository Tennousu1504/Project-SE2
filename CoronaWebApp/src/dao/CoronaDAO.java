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
	Connection connection = DBConnect.getConnection();
		try {
			String SELECT_ALL_PATIENTS = "SELECT * FROM corona2020 ORDER BY total_cases DESC";
			PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_PATIENTS);
		    ResultSet rs = preparedStatement.executeQuery();
			while (rs.next()) {
				String iso_code = rs.getString("iso_code");
				String location= rs.getString("location");
			    String date = rs.getString("date");
				String total_cases=rs.getString("total_cases");
				String new_cases = rs.getString("new_cases");
				String total_deaths= rs.getString("total_deaths");
			    String new_deaths = rs.getString("new_deaths");
				String total_cases_per_million=rs.getString("total_cases_per_million");
				String new_cases_per_million = rs.getString("new_cases_per_million");
				String total_deaths_per_million= rs.getString("total_deaths_per_million");
			    String new_deaths_per_million = rs.getString("new_deaths_per_million");
//				String total_tests=rs.getString("total_tests");
//				String new_tests=rs.getString("new_tests");
//				String total_tests_per_thousand = rs.getString("total_tests_per_thousand");
//			    String new_tests_per_thousand = rs.getString("new_tests_per_thousand");
//				String tests_units=rs.getString("total_tests");
				coronas.add(new Corona(iso_code, location, date, total_cases, new_cases, total_deaths, 
						                  new_deaths, total_cases_per_million, new_cases_per_million,
						                  total_deaths_per_million, new_deaths_per_million
//						                  , total_tests, 
//						                  new_tests,total_tests_per_thousand,new_tests_per_thousand, tests_units
						                  ));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return coronas;
	}
	public Corona selectCorona(String iso_code) {
		Corona corona = null;
		Connection connection = DBConnect.getConnection();
		try {
			String SELECT_ISO_CODE = "SELECT * FROM corona2020 WHERE iso_code = ?";
					PreparedStatement ps = connection.prepareStatement(SELECT_ISO_CODE);
					ps.setString(1, iso_code);
					ResultSet rs = ps.executeQuery();
					while (rs.next()) {
						String location= rs.getString("location");
					    String date = rs.getString("date");
						String total_cases=rs.getString("total_cases");
						String new_cases = rs.getString("new_cases");
						String total_deaths= rs.getString("total_deaths");
					    String new_deaths = rs.getString("new_deaths");
						String total_cases_per_million=rs.getString("total_cases_per_million");
						String new_cases_per_million = rs.getString("new_cases_per_million");
						String total_deaths_per_million= rs.getString("total_deaths_per_million");
					    String new_deaths_per_million = rs.getString("new_deaths_per_million");
//						String total_tests=rs.getString("total_tests");
//						String new_tests=rs.getString("new_tests");
//						String total_tests_per_thousand = rs.getString("total_tests_per_thousand");
//					    String new_tests_per_thousand = rs.getString("new_tests_per_thousand");
//						String tests_units=rs.getString("total_tests");
						corona=new Corona(iso_code, location, date, total_cases, new_cases, total_deaths, 
								                  new_deaths, total_cases_per_million, new_cases_per_million,
							                     total_deaths_per_million, new_deaths_per_million
								                  //, total_tests, 
//								                  new_tests,total_tests_per_thousand,new_tests_per_thousand, tests_units
								                  );
					}
		} catch(SQLException e) {
			e.printStackTrace();
		}
		return corona;
	}
	
public void insertCorona(Corona corona) throws SQLException {
		Connection connection = DBConnect.getConnection();
		try {
String INSERT_CORONA = "INSERT INTO corona2020 (iso_code, location, date, total_cases, new_cases, total_deaths, new_deaths, total_cases_per_million, new_cases_per_million,total_deaths_per_million, new_deaths_per_million) VALUES (?,?,?,?,?,?,?,?,?,?,?)";
			
			PreparedStatement ps = connection.prepareStatement(INSERT_CORONA);
			ps.setString(1, corona.getIso_code() );
			ps.setString(2, corona.getLocation() );
			ps.setString(3, corona.getDate() );
			ps.setString(4, corona.getTotal_cases());
			ps.setString(5, corona.getNew_cases());
			ps.setString(6, corona.getTotal_deaths());
			ps.setString(7, corona.getNew_deaths());
			ps.setString(8, corona.getTotal_cases_per_million());
			ps.setString(9, corona.getNew_cases_per_million());
			ps.setString(10, corona.getTotal_deaths_per_million());
			ps.setString(11, corona.getNew_deaths_per_million());
//			ps.setString(12, corona.getTotal_tests());
//			ps.setString(13, corona.getNew_tests());
//			ps.setString(14, corona.getTotal_tests_per_thousand());
//			ps.setString(15, corona.getNew_tests_per_thousand());
//			ps.setString(16, corona.getTests_units());
			ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
public boolean updateCorona(Corona corona) throws SQLException {
	boolean rowUpdated = false;
	Connection connection = DBConnect.getConnection();
	try {
		String UPDATE_CORONA = "UPDATE corona2020 SET location = ?, date = ?, total_cases = ?,  new_cases = ? ,total_deaths = ?, new_deaths = ?, total_cases_per_million = ?, new_cases_per_million = ?, total_deaths_per_million = ?, new_deaths_per_million = ?  WHERE iso_code=? ";
		PreparedStatement ps = connection.prepareStatement(UPDATE_CORONA);
		
		ps.setString(1, corona.getLocation() );
		ps.setString(2, corona.getDate() );
		ps.setString(3, corona.getTotal_cases());
		ps.setString(4, corona.getNew_cases());
		ps.setString(5, corona.getTotal_deaths());
		ps.setString(6, corona.getNew_deaths());
		ps.setString(7, corona.getTotal_cases_per_million());
		ps.setString(8, corona.getNew_cases_per_million());
		ps.setString(9, corona.getTotal_deaths_per_million());
		ps.setString(10, corona.getNew_deaths_per_million());
//		ps.setString(11, corona.getTotal_tests());
//		ps.setString(12, corona.getNew_tests());
//		ps.setString(13, corona.getTotal_tests_per_thousand());
//		ps.setString(14, corona.getNew_tests_per_thousand());
//		ps.setString(15, corona.getTests_units());
       	ps.setString(11, corona.getIso_code() );
		ps.executeUpdate();
	}catch (SQLException e) {
		e.printStackTrace();
	}
	return rowUpdated;
	
}
public boolean deleteCorona(String iso_code) throws SQLException{
	boolean rowDeleted = false;
	Connection connection = DBConnect.getConnection();
	try {
		String DELETE_CORONA = "DELETE FROM corona2020 WHERE iso_code = ?";
		PreparedStatement ps = connection.prepareStatement(DELETE_CORONA);
		ps.setString(1, iso_code);
		rowDeleted = ps.executeUpdate() > 0;
				
	} catch(SQLException e) {
		e.printStackTrace();
		
	}
	return rowDeleted;
}




}
