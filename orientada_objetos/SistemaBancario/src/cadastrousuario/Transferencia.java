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
public class Transferencia  extends CaixaEletronico{
    protected double valor;

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    
    public void transferir(double valor){
        //TODO
    }

    @Override
    public String toString() {
        return "Transferencia{" + "valor=" + valor + '}';
    }
    
}
