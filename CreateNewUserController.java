package project;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;

import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ResourceBundle;

public class CreateNewUserController implements Initializable {

    @FXML
    private Button CreateNewAccountButton;
     

    @FXML
    private Label wrongLogin;

   
    @FXML
    private Button backToLoginPageButton;



    @FXML
    private TextField userNameTextField;

    @FXML
    private PasswordField newPasswordTextField;


    @FXML
    private TextField emailAddressTextField;

    @FXML
    void createNewAccount(ActionEvent event) {
        //write new user data on file User-Login-Info.txt
        String name = userNameTextField.getText();
        
        String password = newPasswordTextField.getText();
       
        String email = emailAddressTextField.getText();

        File f = null;
        FileWriter fw = null;
        String str = "";
        str = "{" + str + name + "," + str + "," + str + password + "," + str + "," + str + email + "}";
        try {
            Files.write(Paths.get("C:\\Users\\nihad\\Desktop\\Project\\src\\project"), str.getBytes(), StandardOpenOption.APPEND);
            
        }catch (IOException e) {
        }

    }


   



    @FXML
    void backToLoginPage(ActionEvent event) throws IOException {
        Stage stage = (Stage) backToLoginPageButton.getScene().getWindow();
        stage.close();
        Stage primaryStage = new Stage();
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("LoginScene.fxml"));

        Parent root = loader.load();
        Scene scene=new Scene(root,600,400);
        primaryStage.setScene(scene);
        primaryStage.show();

    }
    
    @FXML
    

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        
    }
}
