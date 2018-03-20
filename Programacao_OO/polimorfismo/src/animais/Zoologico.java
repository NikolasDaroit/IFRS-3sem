package animais;

import java.util.ArrayList;
import java.util.Iterator;

public class Zoologico {
	
	//private ArrayList<Animal> jaula	= new ArrayList<Animal>();
	private ArrayList<Animal> jaula = new ArrayList<Animal>();
	public Zoologico() {
		this.jaula.add(new Cavalo());
		this.jaula.add(new Dogo());
		this.jaula.add(new Preguica());
		this.jaula.add(new Gato());
		
		
		
	}
	public static void main(String[] args) {
		Zoologico zoo = new Zoologico();
		
		for (Animal animal : zoo.jaula) {
			animal.emitirSom();
			
		}
	}
}
