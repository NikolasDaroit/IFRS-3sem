package pessoas;

public class Pobre extends Pessoa{
	private double dinheiro = 100;
	public void trabalha() {
		this.dinheiro+=1000;
	}
}
