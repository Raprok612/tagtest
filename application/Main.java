package application;

import Controller.LogginController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class Main extends Application {
	Stage primaryStage;

	@Override
	public void start(Stage primaryStage) {
		Parent root = null;
		this.primaryStage = primaryStage;

		try {
			// 창을띄운다- 
			FXMLLoader lodar = new FXMLLoader(getClass().getResource("/View/loggin.fxml"));

			root = lodar.load();
			LogginController lc = lodar.getController();
			// primaryStage로 권한을 넘겨준다-
			lc.setDialog(primaryStage);
			Scene scene = new Scene(root);
			this.primaryStage.getIcons().add(new Image("file:image/Back.jpg"));
			primaryStage.setTitle("진료예약관리 로그인");
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		launch(args);
	}

	public Stage getPrimaryStage() {
		return primaryStage;
	}
}
