package ex1;

import java.util.ArrayList;

public class CadastroPessoa {
	private int qtdAtual;
	private ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();
	
	public Pessoa cadastraPessoa(Pessoa pessoa) {
		pessoas.add(pessoa);
		return pessoa;
		
	}
	public void imprimeCadastro() {
		for (Pessoa pessoa : pessoas) {
			System.out.println(pessoa);
		}
	}
	
	public int getQtdAtual() {
		return qtdAtual;
	}
	public void setQtdAtual(int qtdAtual) {
		this.qtdAtual = qtdAtual;
	}
	public ArrayList<Pessoa> getPessoas() {
		return pessoas;
	}
	public void setPessoas(ArrayList<Pessoa> pessoas) {
		this.pessoas = pessoas;
	}

}
