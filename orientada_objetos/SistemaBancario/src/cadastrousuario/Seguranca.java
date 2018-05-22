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
public class Seguranca extends Funcionario{
    protected int turno; //10 madrugada 20 dia 30 tarde

    public int getTurno() {
        return turno;
    }

    public void setTurno(int turno) {
        this.turno = turno;
    }

    @Override
    public String toString() {
        return "Seguranca{Nome: " +this.nome + " turno=" + turno + '}';
    }
    
}
