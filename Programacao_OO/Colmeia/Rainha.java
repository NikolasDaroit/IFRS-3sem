
public class Rainha extends Abelha{
	
	@Override
	public void trabalhar() {
		System.out.println("Parindo");
	}

	public Operaria cria() {this.trabalhar();
		return new Operaria();
	}
	
}
