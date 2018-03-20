package pessoas;

public class Miserable extends Pessoa{
	private double dinheiro = 0;
	private double CACHACA = 1;
	public void mendiga() {
		this.dinheiro+=0.25;
		if (isSuficientePraCachaca()) {
			this.dinheiro-=CACHACA;
		}
	}
	public boolean isSuficientePraCachaca() {
		if (this.dinheiro >=CACHACA) {
			return true;
		}
		return false;
	}
}
