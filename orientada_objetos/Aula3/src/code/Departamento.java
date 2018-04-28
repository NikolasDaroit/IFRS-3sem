package code;

public class Departamento {
	private String nome;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String toString() {
    	return this.nome;
    }
	Departamento(){
		nome="Recursos Humanos";
	}
}
