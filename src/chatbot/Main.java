package chatbot;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application{
	
	static ChatBot chatBot;
	
	
	@Override
	public void start(Stage primaryStage) throws IOException {
		
		//TODO дизайн, заголовок графика, ImageView с картинкой
		Parent panel = FXMLLoader.load(getClass().getResource("main.fxml"));
		
		Scene scene = new Scene(panel, 673, 432);
		
		primaryStage.setTitle("EQBot");
		primaryStage.setScene(scene);
		primaryStage.show();
		
		chatBot = new ChatBot();
	}
	
	public static void main(String[] args) {
		launch(args);
	}

}
