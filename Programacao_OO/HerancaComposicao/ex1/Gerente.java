package ex1;

public class Gerente extends Funcionario{
	private String area;
	public Gerente() {
		this.imposto = 0.05;
	}
	public void imprimeDados() {
		System.out.println(this);
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	@Override
	public String toString() {
		return "Gerente [area=" + area + ", salario=" + salario + ", nome=" + nome + ", data=" + data + "]";
	}
}
