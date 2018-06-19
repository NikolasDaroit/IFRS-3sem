/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fichas;

import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;
import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import java.util.Random;
import javafx.event.ActionEvent;
import javafx.scene.layout.Pane;
/**
 * FXML Controller class
 *
 * @author Aluno
 */
public class PrincipalController implements Initializable {
    @FXML
    private Label lblMedico;
    @FXML
    private Label lblEnfermagem;  
    @FXML 
    private Label lblDentista;
    @FXML
    private Button btnMedico;
    @FXML
    private Button btnEnfermagem;  
    @FXML 
    private Button btnDentista;
    
    /**
     * Initializes the controller class.
     */
    public int getId(){
        

        Random rand = new Random();

        int  n = rand.nextInt(10000) + 1;
        return n;
    }
     public Map<String, Integer> getFicha(){
        Conexao c = new Conexao();
        ResultSet rs = null;
        Connection dbConnection = c.getConexao();
        String getFichas = "select * from poo_fichas where id = 1";
        Map<String, Integer> fichas = new HashMap<>();
        
        try {   
            PreparedStatement ps = null; 
            ps = dbConnection.prepareStatement(getFichas);
            rs = ps.executeQuery();
            rs.next();
            
            fichas.put("medico", rs.getInt(1) );
            fichas.put("enfermagem", rs.getInt(2) );
            fichas.put("dentista", rs.getInt(3) );
            
        } catch (Exception e) {
            System.out.println(e);
        }
        return fichas;
    }
    public void aumentaFicha(String espec, int val){
        Conexao c = new Conexao();
        PreparedStatement ps = null;
        Connection dbConnection = c.getConexao();
        String update = "";
        switch(espec){
            case "medico":
                 update = "update poo_fichas set medico=? where id=1";
                break;
            case "enfermagem":
                 update = "update poo_fichas set enfermagem=? where id=1";
                break;
            case "dentista":
                 update = "update poo_fichas set dentista=? where id=1";
                break;
        }
        try{
            
            ps = dbConnection.prepareStatement(update);
            //ps.setString(1, espec);
            ps.setInt(1, val);
            System.out.println(ps.toString());

            ps.executeUpdate();
            System.out.println("All good");
        }catch(Exception e){
            
            System.out.println("not good enought "+ e);
        }
    }
    
    public int getFichaPaciente(String espec){
        Conexao c = new Conexao();
        PreparedStatement ps = null;
        Connection dbConnection = c.getConexao();
        int idPac = getId();
        //cartao sus
        String insert = "insert into poo_paciente"
                +"(id, senha, data, especialidade) values"
                +"( ?,   ?,     ?,       ?)";
        try{
            Map<String, Integer> fichas = new HashMap<>();
            fichas = getFicha();
            String date = new SimpleDateFormat("dd-MM-yyyy").format(new Date());
            
            ps = dbConnection.prepareStatement(insert);
            ps.setInt(1, idPac);
            ps.setInt(2, fichas.get(espec));
            ps.setString(3, date);
            ps.setString(4, espec);
            ps.executeUpdate();
            aumentaFicha(espec, fichas.get(espec)+1);
            return idPac;
        }catch(Exception e){
            System.out.println(e);
        }
        return -1;
    }
    @FXML
    private void handleFichaMed(ActionEvent av){
        int idPac = getFichaPaciente("medico");
        System.out.println("fichas.PrincipalController.handleFichaMed()" + idPac);
        Parent root;
        try{
            FXMLLoader fxmlLoader = new FXMLLoader();
            root = fxmlLoader.load(getClass().getResource("Detalhe.fxml").openStream());
            DetalheController detalhe = (DetalheController) fxmlLoader.getController();
            
            Stage stage = Fichas.stage;
            Scene scene = new Scene(root);
            stage.setScene(scene);
            detalhe.updateLabel(String.valueOf(idPac));
        }catch (IOException e){
            
        }
       
    }
    @FXML
    private void handleFichaEnf(ActionEvent av){
        int idPac = getFichaPaciente("enfermagem");
        System.out.println("fichas.PrincipalController.handleFichaEnf()" + idPac);
        Parent root;
        try{
            FXMLLoader fxmlLoader = new FXMLLoader();
            root = fxmlLoader.load(getClass().getResource("Detalhe.fxml").openStream());
            DetalheController detalhe = (DetalheController) fxmlLoader.getController();
            
            Stage stage = Fichas.stage;
            Scene scene = new Scene(root);
            stage.setScene(scene);
            detalhe.updateLabel(String.valueOf(idPac));
        }catch (IOException e){
            
        }
       
    }
    @FXML
    private void handleFichaDen(ActionEvent av){
        int idPac = getFichaPaciente("dentista");
        System.out.println("fichas.PrincipalController.handleFichaDen()" + idPac);
        Parent root;
        try{
            FXMLLoader fxmlLoader = new FXMLLoader();
            root = fxmlLoader.load(getClass().getResource("Detalhe.fxml").openStream());
            DetalheController detalhe = (DetalheController) fxmlLoader.getController();
            
            Stage stage = Fichas.stage;
            Scene scene = new Scene(root);
            stage.setScene(scene);
            detalhe.updateLabel(String.valueOf(idPac));
        }catch (IOException e){
            
        }
       
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        Conexao c = new Conexao();
        String dbVal = "1";
        Map<String, Integer> fichas = new HashMap<>();
        fichas = getFicha();
        
        
        lblMedico.setText(fichas.get("medico").toString());
        lblEnfermagem.setText(fichas.get("enfermagem").toString());
        lblDentista.setText(fichas.get("dentista").toString());
              
    }  
   
    
    
}
