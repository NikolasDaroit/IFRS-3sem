package ex1;

public class Funcionario extends Pessoa{
	protected double salario;
	protected double imposto;
	public Funcionario() {
		this.imposto = 0.03;
	}
	public double getImposto() {
		return imposto;
	}
	public void setImposto(double imposto) {
		this.imposto = imposto;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public double calculaImposto() {
		return salario*imposto;
		
	}
	public void imprimeDados() {
		System.out.println(this);
		
	}
	@Override
	public String toString() {
		return "Funcionario [salario=" + salario + ", nome=" + nome + ", data=" + data + "]";
	}
	
}
