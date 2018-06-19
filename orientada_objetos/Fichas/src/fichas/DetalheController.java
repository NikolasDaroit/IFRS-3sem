/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fichas;

import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Aluno
 */
public class DetalheController implements Initializable {
    @FXML 
    private Label lblFicha;
    @FXML
    private Button btnConfirmar;
    @FXML
    private TextField txtSus;
    int idPac;
    /**
     * Initializes the controller class.
     */
    public void updateLabel(String idPac){
        this.idPac = Integer.parseInt(idPac);
        int ficha = updateLabelAfter( this.idPac );
        this.lblFicha.setText(String.valueOf(ficha));
    } 
    
    public int updateLabelAfter(int idPac){
        Conexao c = new Conexao();
        ResultSet rs = null;
        Connection dbConnection = c.getConexao();
        String getFichas = "select * from poo_paciente where id = ?";
        Map<String, Integer> fichas = new HashMap<>();
        
        try {   
            PreparedStatement ps = null; 
            ps = dbConnection.prepareStatement(getFichas);
            ps.setInt(1, idPac);
            rs = ps.executeQuery();
            rs.next();
            return rs.getInt(2);
            
        } catch (Exception e) {
            System.out.println(e);
        }
        return -1;

    }
    @FXML
    public void handleConfirma(ActionEvent av){
        Conexao c = new Conexao();
        PreparedStatement ps = null;
        Connection dbConnection = c.getConexao();
        int idPac = this.idPac;
        //cartao sus
        
        String update = "update poo_paciente set cartaosus=? where id=?";
        try{
            
            ps = dbConnection.prepareStatement(update);
            ps.setString(1, txtSus.getText());
            ps.setInt(2, idPac);
            ps.executeUpdate();
            System.out.println("All good");
        }catch(Exception e){
            System.out.println(e);
        }
        
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
