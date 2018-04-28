package agenda;

public class PessoaFisica extends Pessoa{
	protected String cpf;
	protected String nome;
	
	//CPF, nome, endereço, data de nascimento, email, estado civi
	
	public PessoaFisica() {
		this.cpf= "10047856958";
		this.nome="qweqwe";
		
	}
	public String toString() {
		return "Nome:"+this.nome+"\nCPF: "+this.cpf+"\nFone: "+this.numero;
	}
	
}
