package application;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;

public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {

		VBox vBox = new VBox(10);
		Button btn = new Button("确定");
		btn.setMaxWidth(80);

		vBox.getChildren().addAll(btn,new TextField()) ;

		try {

			//BorderPane root = new BorderPane();
			Scene scene = new Scene(vBox, 400, 200);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {

		final String DB_URL = "jdbc:mysql://localhost:3306/?useSSL=false";
		final String USER = "root";
		final String PSW = "Liuqingxun";

		DataBase.connectDB(DB_URL, USER, PSW);
		DataBase.traverse("student","basic_information");
		
//		select student.basic_information.*,student.stu_score.* from student.basic_information left join student.stu_score on student.basic_information.id=student.stu_score.id

		
//		DataBase.createDB("student");
//		
//		DataBase.createTab("student","basic_information","id INT");		
//		AlterTable.colSet("student","basic_information","id","INT DEFAULT '1' PRIMARY KEY");
//		AlterTable.colSet("student","basic_information","id","INT AUTO_INCREMENT");
//		AlterTable.addColumn("student","basic_information","name","char(16) NOT NULL");
//		AlterTable.addColumn("student","basic_information","gender","boolean NOT NULL");
//		AlterTable.addColumn("student","basic_information","cellphone","char(16)");
//		AlterTable.addColumn("student","basic_information","birthday","date");
//		
//		DataBase.createTab("student","stu_score","id INT");
//		AlterTable.colSet("student","stu_score","id","INT DEFAULT '1' PRIMARY KEY");
//		AlterTable.colSet("student","stu_score","id","INT AUTO_INCREMENT");		
//		AlterTable.addColumn("student","stu_score","Chinese","INT");
//		AlterTable.addColumn("student","stu_score","Math","INT");
//		AlterTable.addColumn("student","stu_score","English","INT");
//		
//		//launch(args);
//		DataBase.insertData("student", "basic_information", "Zhang", true, "131", "1991-01-02");
//		DataBase.insertData("student", "basic_information", "Wang", false, "132", "1991-02-02");
//		DataBase.insertData("student", "basic_information", "Li", true, "133", "1991-02-03");
//		DataBase.insertData("student", "basic_information", "Zhao", true, "134", "1991-02-04");
//		DataBase.insertData("student", "basic_information", "Wu", false, "135", "1991-05-02");

		// Students stu = new Students();

	}
}
