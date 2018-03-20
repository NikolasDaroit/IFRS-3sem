package animais;

public abstract class Animal {
	protected String nome;
	protected String raca;
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
