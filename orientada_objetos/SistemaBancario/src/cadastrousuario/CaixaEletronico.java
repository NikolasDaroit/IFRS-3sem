/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadastrousuario;

import java.sql.Date;

/**
 *
 * @author Aluno
 */
public class CaixaEletronico {
    protected int idTransacao;
    protected Date data;
    protected int tipo;
    protected Agencia agencia;

    public Agencia getAgencia() {
        return agencia;
    }

    public void setAgencia(Agencia agencia) {
        this.agencia = agencia;
    }
   
   
    public void Transferencia(){
        //TODO
    }

    public int getIdTransacao() {
        return idTransacao;
    }

    public void setIdTransacao(int idTransacao) {
        this.idTransacao = idTransacao;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "CaixaEletronico{" + "idTransacao=" + idTransacao + ", data=" + data + ", tipo=" + tipo + ", agencia=" + agencia + '}';
    }
    
}
