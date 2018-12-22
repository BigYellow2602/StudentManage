package application;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AlterTable extends DataBase {

	public static void addColumn(String DbName, String tabName, String colName, String colType) {

		String addCulumnSQL = "ALTER TABLE " + DbName + "." + tabName + " ADD " + colName + " " + colType;

		try {
			PreparedStatement stmt = conn.prepareStatement(addCulumnSQL);
			stmt.execute(addCulumnSQL);

			System.out.println("Add column " + colName + " successfully !");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void addColumn(String tabName, String colName, String colType) {

		String addCulumnSQL = "ALTER TABLE " + tabName + " ADD " + colName + " " + colType;

		try {
			PreparedStatement stmt = conn.prepareStatement(addCulumnSQL);
			stmt.execute(addCulumnSQL);

			System.out.println("Add column " + colName + " successfully !");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static void colSet(String DbName,String tabName,String colName,String colProp) {
		String colSet = "ALTER TABLE " + DbName + "." + tabName + " MODIFY " + colName + " " + colProp;

		try {
			PreparedStatement stmt = conn.prepareStatement(colSet);
			stmt.execute(colSet);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	public static void colSet(String tabName,String colName,String colProp) {
		String colSet = "ALTER TABLE " + tabName + " MODIFY " + colName + " " + colProp;

		try {
			PreparedStatement stmt = conn.prepareStatement(colSet);
			stmt.execute(colSet);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

}
