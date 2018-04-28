package agenda;

public class PessoaJuridica extends Pessoa {
	protected String cnpj;
	protected String nome;
	public PessoaJuridica() {
		this.cnpj="2342323422";
		this.nome="asdiao";
	
	}
	public String toString() {
		return "Nome:"+this.nome+"\nCNPJ: "+this.cnpj+"\nFone: "+this.numero;
	}
}
