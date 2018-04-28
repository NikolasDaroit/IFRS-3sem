package ex2;

public class Vendedor extends Funcionario {
	private float comissao = (float) 0.03;
	
	public float calcularSalario() {
		return super.calcularSalario() * (1+comissao);
	}
}
