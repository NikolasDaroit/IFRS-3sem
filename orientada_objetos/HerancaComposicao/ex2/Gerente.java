package ex2;

public class Gerente extends Funcionario {
	private float desempenho = (float) 0.02;
	
	public float calcularSalario() {
		return super.calcularSalario() * (1+desempenho);
	}
}
