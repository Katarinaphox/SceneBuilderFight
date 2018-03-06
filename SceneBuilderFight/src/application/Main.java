package application;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;


public class Main extends Application {
	public static void main(String[] args) {
		launch(args);
	}
	@Override
	public void start(Stage primaryStage) {
		try {
			Group group = new Group();
			
			Parent content = FXMLLoader.load(getClass().getResource("fight.fxml"));
			BorderPane root = new BorderPane();
			root.setCenter(content);
			group.getChildren().add(root);
			
			primaryStage.setScene(new Scene(group, 400, 300));
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	
}
