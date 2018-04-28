
public class TCC {
	private String nome;
	private Cronograma cronograma;
	private int versao;
	private Orientador orientador;
	private String problema = "" ;
	
	public TCC(){
	   
	   cronograma = new Cronograma();
	   versao = 0;
	   }
	
	/* GET & SET*/
	public int getVersao() {
		return versao;
	}
	
	public void setVersao(int versao) {
		this.versao = versao;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public Cronograma getCronograma() {
		return cronograma;
	}
	
	public void setCronograma(Cronograma cronograma) {
		this.cronograma = cronograma;
	}
	public Orientador getOrientador() {
		return orientador;
	}

	public void setOrientador(Orientador orientador) {
		this.orientador = orientador;
		orientador.setOrientandos(1);
	}
	public String getProblema() {
		return problema;
	}

	public void setProblema(String problema) {
		this.problema += (", "+problema);
	}
}
