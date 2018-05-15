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
public class Dog extends Animal{
        private boolean brabao;

    public void setBrabao(boolean brabao) {
        this.brabao = brabao;
    }

    public boolean isBrabao() {
        return brabao;
    }
	public Dog(String string) {
		super(string);
	}

	public Dog() {
		super();
	}

	public void emitirSom() {
		System.out.println("imagine um latido");
	}
        
    @Override
    public String toString() {
        return "Dog{Nome: " +this.nome+ " Peso: "+this.peso+" Brabão: "+this.brabao+"}";
    }
 
}