package application;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			BorderPane root = new BorderPane();
			Scene scene = new Scene(root,400,400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		
		final String DB_URL = "jdbc:mysql://localhost:3306/?useSSL=false";
		final String USER = "root";
		final String PSW = "Liuqingxun";

		
		DataBase.connectDB(DB_URL, USER, PSW);;
//		DataBase.createDB("student");
//		DataBase.createTab("student","basic_information","id INT");
//		
//		AlterTable.colSet("student","basic_information","id","INT DEFAULT '1' PRIMARY KEY");
//		AlterTable.colSet("student","basic_information","id","INT AUTO_INCREMENT");
//		AlterTable.addColumn("student","basic_information","name","char(16) NOT NULL");
//		AlterTable.addColumn("student","basic_information","gender","boolean NOT NULL");
//		AlterTable.addColumn("student","basic_information","cellphone","char(16)");
//		AlterTable.addColumn("student","basic_information","birthday","date");
		//launch(args);
		DataBase.insertData("student","basic_information","Wu",false,"135","1991-02-02");
		
		Students stu = new Students();
		
	}
}
