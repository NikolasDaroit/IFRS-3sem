/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadastrousuario;

import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.ResourceBundle;
import static javafx.application.ConditionalFeature.FXML;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Aluno
 */
public class CadastroUsuarioController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @FXML
    private TextField nomeCompleto;
    @FXML
    private TextField usuario;
    @FXML
    private TextField email;
    @FXML
    private TextField senha;
    @FXML
    private TextField reSenha;
    @FXML
    private Label mensagemSistema;
    @FXML
    public   ListView lvUsuario;
    
    
    public ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
    
    private boolean verificaSenhaIgual(String senha1, String senha2){
        if(senha1.equals(senha2)){
            return true;
        }
        return false;
    }
    
    @FXML
    private void cadastroButtonAction(ActionEvent event) {
        if (!verificaSenhaIgual(senha.getText(), reSenha.getText()) && senha.getText().length()>0){
            mensagemSistema.setText("Senhas incompativeis");
        }
        Usuario u = new Usuario();
        u.setNome(nomeCompleto.getText());
        u.setEmail(email.getText());
        u.setUsuario(usuario.getText());
        u.setSenha(senha.getText());
        u.setReSenha(reSenha.getText());
        usuarios.add(u);
        mensagemSistema.setText("Usuario "+u.getUniqueID()+" cadastrado corretamente!");
        
        //lvUsuario.getItems().add(u);
        lvUsuario.scrollTo(lvUsuario.getItems().size() - 1);
        lvUsuario.getItems().add(u);
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        
        
        // TODO
    }    
    public void insertUser(String nome, String email, String usuario, String senha, String reSenha){
        Conexao c = new Conexao();
        Connection dbConnection = c.getConexao();
        String insertUserSql = "INSERT INTO usuariojava"
                               +"(nome, email, usuario, senha, reSenha) VALUES"
                               +"("+nome+","
                               + ""+email+""
                               + ""+usuario+""
                               + ""+senha+""
                               + ""+reSenha+");";
        try {   
           PreparedStatement ps = null; 
           ps = dbConnection.prepareStatement(insertUserSql);
            System.out.println(insertUserSql);
        } catch (Exception e) {
        }
    }
    
}
