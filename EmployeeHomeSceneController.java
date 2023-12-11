/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class EmployeeHomeSceneController {

   

    @FXML
    private Button applyForLeaveButton;

     @FXML
    private Button notificationButton;



    @FXML
    private Button logoutButton;
    @FXML
    private Button submitreports;
    @FXML
    private Button checkEmployeeInfoButton;
   
    
   

    @FXML
    void logout(ActionEvent event) throws IOException {
        Stage stage = (Stage) logoutButton.getScene().getWindow();
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
    void openEmployeeApplyLeavePage(ActionEvent event) throws IOException {
        Stage stage = (Stage) applyForLeaveButton.getScene().getWindow();
      
        Stage primaryStage = new Stage();
        FXMLLoader loader = new FXMLLoader();

        loader.setLocation(getClass().getResource("EmployeeApplyforleaveScene.fxml"));

        Parent root = loader.load();
        Scene scene = new Scene(root, 600, 400);
        primaryStage.setScene(scene);
        primaryStage.show();
    }


    @FXML
    private void openEmployeeEditInfo(ActionEvent event) {
    }

    @FXML
    private void submitreports(ActionEvent event) {
    }

   

 

}
