/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication2;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

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
    }
}
