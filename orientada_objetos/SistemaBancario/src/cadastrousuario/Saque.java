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
public class Saque extends CaixaEletronico{
    protected double valor;
    
    public void sacar(double valor){
        //TODO
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Saque{" + "valor=" + valor + '}';
    }
}
