/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ProgressIndicator;
import javafx.scene.control.TitledPane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author nihad
 */
public class PrintingManagerHomeSceneController implements Initializable {

    @FXML
    private Button notificationButton;

  
    @FXML
    private Button logoutButton;
    @FXML
    private ProgressIndicator taskOneProgressIndicator;
    @FXML
    private ProgressIndicator taskTwoProgressIndicator;
    @FXML
    private Button assignTaskButton;
   

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    


    @FXML
    private void logout(ActionEvent event) {
    }

    
    
    @FXML
    private void assignTaskButton(ActionEvent event) throws Exception {
        
        Parent Parent = FXMLLoader.load(getClass().getResource("PrintManagerAssignTask.fxml"));
        Scene Scene = new Scene(Parent);
        Stage window =(Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(Scene);
        window.show();
        
    
    }

    @FXML
    private void viewOrders(ActionEvent event) {
    }
}
