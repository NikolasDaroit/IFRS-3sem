package ex1;

import java.util.Date;

public abstract class Pessoa {
	protected String nome;
	protected Data data;
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Data getData() {
		return data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	void imprimeDados() {
		System.out.println(this);
	}
	
	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", data=" + data + "]";
	}
}
