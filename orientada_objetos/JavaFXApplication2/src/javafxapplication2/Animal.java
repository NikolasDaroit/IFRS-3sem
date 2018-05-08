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
public abstract class Animal {
	protected String nome;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
	protected double peso;

    public String getNome() {
        return nome;
    }

    public double getPeso() {
        return peso;
    }
	public Animal() {
		this.nome = "Bob";		
	}
	public Animal(String nome) {
		this.nome = nome;
	}
	public String caminha() {
		return "caminhando";
	}
	public void emitirSom() {
		System.out.println("imagine um barulho");
	}
}
