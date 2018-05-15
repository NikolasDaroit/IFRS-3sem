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
public class Gato extends Animal{
    private boolean arranha;

    public boolean isArranha() {
        return arranha;
    }

    public void setArranha(boolean arranha) {
        this.arranha = arranha;
    }
	public Gato(String string) {
		super(string);
	}

	public Gato() {
		super();
	}

	public void emitirSom() {
		System.out.println("imagine um miado");
	}

    @Override
    public String toString() {
        return "Gato{Nome: " +this.nome+ " Peso: "+this.peso+" Arranha: "+this.arranha+"}";
    }
	
	
}