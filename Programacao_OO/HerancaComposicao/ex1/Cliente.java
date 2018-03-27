package ex1;

public class Cliente extends Pessoa{
	private int codigo;
	public void imprimeDados() {
		System.out.println(this);
	}
	@Override
	public String toString() {
		return "Cliente [codigo=" + codigo + ", nome=" + nome + ", data=" + data + "]";
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
}
