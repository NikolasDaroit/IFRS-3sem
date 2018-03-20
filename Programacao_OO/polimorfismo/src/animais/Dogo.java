package animais;

public class Dogo extends Animal{
	public Dogo(String string) {
		super(string);
	}

	public Dogo() {
		super();
	}

	public void emitirSom() {
		System.out.println("imagine um latido");
	}
}
