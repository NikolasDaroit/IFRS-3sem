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
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author docente
 */
public class DogConstroller implements Initializable {

    /**
     * Initializes the controller class.
     */
    @FXML
    private Button dog;
    
    
    @FXML
    private TextField nome;
    @FXML
    private TextField peso;
    @FXML
    private CheckBox brabao;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    @FXML
    private void dogButtonAction(ActionEvent event) {
        System.out.println("Cadastrando dog");
        Dog c = new Dog();
        c.setNome(nome.getText());
        c.setPeso( Double.parseDouble(peso.getText()));
        c.setBrabao(brabao.isSelected());
        c.emitirSom();
    }
}
