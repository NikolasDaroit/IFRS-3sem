/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication2;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.stage.Stage;

/**
 *
 * @author docente
 */
public class PrincipalController implements Initializable {
    
    @FXML
    private Label label;
    @FXML
    private Button cavalo;
    @FXML
    private Button gato;
    @FXML
    private Button dog;
    @FXML 
    private ListView bichos;
    
    Pets p = new Pets();
    
    
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        label.setText("Escolha quem deseja cadastrar");
        cavalo.setVisible(true);
        dog.setVisible(true);
        gato.setVisible(true);
    }
    
    @FXML
    private void trocaTela(ActionEvent ev){

        System.out.println("trocando de tela");
        
        Parent root;
        try {

            //modo 2
            Stage stage = JavaFXApplication2.stage;
            
            root = FXMLLoader.load(getClass().getResource("Cavalo.fxml"));
            Scene scene = new Scene(root);
            
            stage.setScene(scene);
            
        } catch (NullPointerException | IOException ex) {
            System.out.println(ex);
        }
        
        
        
       
    }
    @FXML
    private void vaiDog(ActionEvent ev){   
        System.out.println("trocando de tela");
        
        Parent root;
        try {
            Stage stage = JavaFXApplication2.stage;
            
            root = FXMLLoader.load(getClass().getResource("Dog.fxml"));
            Scene scene = new Scene(root);
            
            stage.setScene(scene);
            
        } catch (NullPointerException | IOException ex) {
            System.out.println("Senhor programador verifique o nome do arquivo FXML");
        }
        
        
        
       
    }
    @FXML
    private void vaiGato(ActionEvent ev){
          System.out.println("trocando de tela");
        
        Parent root;
        try {
            //modo 2
            Stage stage = JavaFXApplication2.stage;
            
            root = FXMLLoader.load(getClass().getResource("Gato.fxml"));
            Scene scene = new Scene(root);
            
            stage.setScene(scene);
            
        } catch (NullPointerException | IOException ex) {
            System.out.println("Senhor programador verifique o nome do arquivo FXML");
        }
        
        
        
       
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        for (Animal animal : Pets.bicharada){
            bichos.getItems().add(animal);
            
        }

        cavalo.setVisible(false);
        gato.setVisible(false);
        dog.setVisible(false);
    }    

}
