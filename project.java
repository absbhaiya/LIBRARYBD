package project;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import static javafx.application.Application.launch;

public class project extends Application {

    private static Stage stg; //we'll need stg variable to change scene
    @Override
    public void start(Stage primaryStage) throws Exception{
//        stg = primaryStage;
        try {
            primaryStage.setResizable(false); //user cannot resize window
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("LoginScene.fxml"));
            Parent root = loader.load();
            Scene scene = new Scene(root, 600, 400);
            primaryStage.setScene(scene);
            primaryStage.show();
        }catch(IOException e){
        }


    }

    public void changeScene(String fxml) throws IOException {
        Parent pane = FXMLLoader.load(getClass().getResource(fxml));
        stg.getScene().setRoot(pane);
    }


    public static void main(String[] args) {
        launch(args);
    }
}

