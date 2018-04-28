package imoveis;

public class Velho extends Imovel {
	protected double desconto=30000;

	public double getDesconto() {
		return desconto;
	}

	public void setDesconto(double adicional) {
		this.desconto = adicional;
	}
	public void print() {
		System.out.println(this.preco-this.desconto);
	}
}
