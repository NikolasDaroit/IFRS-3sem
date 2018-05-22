/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadastrousuario;

/**
 *
 * @author Aluno
 */
public class Cliente extends Usuario{
    protected String cpf;

   

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void abrirConta(int tipo){
        switch (tipo){
            case 10:
                ContaSalario contaSalario = new ContaSalario();
                contaSalario.setCliente(this);
                break;
            case 20:
                ContaCorrente contaCorrente = new ContaCorrente();
                contaCorrente.setCliente(this);
                break;
            case 30: 
                ContaPoupanca contaPoupanca = new ContaPoupanca();
                contaPoupanca.setCliente(this);
                break;
        }
        
        
    }

    @Override
    public String toString() {
        return "Cliente{Nome: " +this.nome + " cpf:" + cpf + '}';
    }
    
}
