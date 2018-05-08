/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication2;

/**
 *
 * @author Aluno
 */
public class Cavalo extends Animal{
    private int velocidade;

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public int getVelocidade() {
        return velocidade;
    }
	public void emitirSom() {
		System.out.println("imagine um relinchar");
	}
}