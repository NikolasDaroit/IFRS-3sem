package ex2;

public class Funcionario {
	private float numeroHoras;
	private float valorHora;
	private String nome;
	public float calcularSalario() {
		return this.numeroHoras*this.valorHora;
	}
	public float calcularSalario(int mes) {
		return this.numeroHoras*this.valorHora;
	}
}
