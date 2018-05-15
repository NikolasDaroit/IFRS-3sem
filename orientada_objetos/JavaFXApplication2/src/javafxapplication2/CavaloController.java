/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication2;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author docente
 */
public class CavaloController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @FXML
    private Button cavalo;
    
    
    @FXML
    private TextField nome;
    @FXML
    private TextField peso;
    @FXML
    private TextField velocidade;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    @FXML
    private void cavaloButtonAction(ActionEvent event) {
        System.out.println("Cadastrando cavalo");
        Cavalo c = new Cavalo();
        c.setNome(nome.getText());
        c.setPeso( Double.parseDouble(peso.getText()));
        c.setVelocidade( Integer.parseInt(velocidade.getText()));
        //cavalo.setVisible(true);
        System.out.println("teste");
        c.emitirSom();
        Pets.addBicho(c);
    }
    @FXML
    private Button voltar;
    
    @FXML
    private void voltarMain(ActionEvent ev){
          System.out.println("trocando de tela");
        
        Parent root;
        try {
            //modo 2
            Stage stage = JavaFXApplication2.stage;
            
            root = FXMLLoader.load(getClass().getResource("Principal.fxml"));
            Scene scene = new Scene(root);
            
            stage.setScene(scene);
            
        } catch (NullPointerException | IOException ex) {
            System.out.println("Senhor programador verifique o nome do arquivo FXML");
        }
    }
}
