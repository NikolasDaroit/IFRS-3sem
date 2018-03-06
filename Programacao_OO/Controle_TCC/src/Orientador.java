
public class Orientador {
	private String nome;
	private String email;
	private int orientandos;
	public Orientador() {
		orientandos = 0;
	}
	/* GET & SET*/
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public int getOrientandos() {
		return orientandos;
	}
	
	public void setOrientandos(int orientandos) {
		this.orientandos += orientandos;
	}
}
