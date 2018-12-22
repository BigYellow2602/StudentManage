package application;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DataBase {

	static final String DRIVER = "com.mysql.jdbc.Driver";
	static Connection conn = null;

	public static void connectDB(String DB_URL,String USER,String PSW) {
		try {
			conn = DriverManager.getConnection(DB_URL, USER, PSW);
			System.out.println("Connected successfully !");

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void createDB(String dbName) {
		
		//String dropSQL = "DROP DATABASE IF EXISTS " + dbName;
		String createSQL = "CREATE DATABASE IF NOT EXISTS " + dbName;

		try {
			
			PreparedStatement stmt = conn.prepareStatement(createSQL);
			//stmt.execute(dropSQL);
			stmt.execute(createSQL);
			
			System.out.println("Created database " + dbName + "!");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static void createTab(String dbName,String tabName,String key) {
		
		String createTabSQL = "CREATE TABLE IF NOT EXISTS " + dbName + "." + tabName + "(" + key + ")";
		
		try {
			PreparedStatement stmt = conn.prepareStatement(createTabSQL);
			stmt.execute(createTabSQL);
			
			System.out.println("Created table " + tabName + "!");	
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void insertData(String dbName,String tabName,String name,boolean gender,String cellphone,String birthday) {
		String insertSQL = "INSERT INTO " + dbName + "." + tabName + " (name,gender,cellphone,birthday) "
				+ "VALUES ('" + name + "'," + gender + "," + cellphone + ",'" + birthday + "')";
		
		
		
		try {
			PreparedStatement stmt = conn.prepareStatement(insertSQL);
			stmt.execute(insertSQL);
			
			System.out.println(insertSQL);
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
