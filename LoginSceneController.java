/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author nihad
 */
public class LoginSceneController implements Initializable {

    @FXML
    private Label wrongLogin;
    @FXML
    private Button createNewUserButton;
    @FXML
    private TextField username;
    @FXML
    private Button LoginButton;
    @FXML
    private PasswordField password;

    /**
     * Initializes the controller class.
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    
            

    @FXML
    private void onClick_Login(ActionEvent event) throws IOException {
        
        if(username.getText().toString().equals("Manager") && password.getText().toString().equals("123")){
        
        Parent Parent = FXMLLoader.load(getClass().getResource("PrintingManagerHomescene.fxml"));
        Scene Scene = new Scene(Parent);
        
        
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(Scene);
        window.show();
        
           
       }
        else if(username.getText().toString().equals("Client") && password.getText().toString().equals("111")){
        
        Parent Parent = FXMLLoader.load(getClass().getResource("ClientOrderDashboard.fxml"));
        Scene Scene = new Scene(Parent);
        
        
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(Scene);
        window.show();
          }
        else if(username.getText().toString().equals("Staff") && password.getText().toString().equals("222")){
        
        Parent Parent = FXMLLoader.load(getClass().getResource("EmployeeHomeScene.fxml"));
        Scene Scene = new Scene(Parent);
        
        
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(Scene);
        window.show();
            }
       else if(username.getText().toString().isEmpty() && password.getText().toString().isEmpty()){
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setTitle ("Error");
            alert.setHeaderText (null);
            alert.setContentText("Please fill up the blank fields");
            alert.showAndWait();
       }
       else{
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setTitle ("Login Failed");
            alert.setHeaderText (null);
            alert.setContentText("Incorrect username or password");
            alert.showAndWait();
       }
       
    }
        
      

           
 

    @FXML
    private void createANewUserAccount(ActionEvent event) throws IOException {
        Stage stage = (Stage) createNewUserButton.getScene().getWindow();
        stage.close();
        Stage primaryStage = new Stage();
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("CreateNewUser.fxml"));

        Parent root = loader.load();
        Scene scene=new Scene(root,600,400);
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    @FXML
    private void onClick_Login(MouseEvent event) {
    }
    }


  

