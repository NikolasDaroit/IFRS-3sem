package imoveis;

public class Novo extends Imovel {
	protected double adicional=50000;

	public double getAdicional() {
		return adicional;
	}

	public void setAdicional(double adicional) {
		this.adicional = adicional;
	}
	public void print() {
		System.out.println(this.preco+this.adicional);
	}
}
