package application;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;

public class Main extends Application
{
	@Override
	public void start(Stage stage) 
	{
		Parent root;
		try
		{
			
			root = FXMLLoader.load(getClass().getResource("/view/BiodataForm.fxml"));
			System.out.println("??");
			
			Scene scene = new Scene(root);
			stage.setScene(scene);
			stage.setTitle("Main Form");
			stage.show();
		} catch (IOException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public static void main(String[] args)
	{
		launch(args);
	}
}
