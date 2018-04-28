/*
 *O aluno deve ter suas características além das suas ações de entregar etapas, 
 *atualizar cronograma, avisar um problema ao professor entre outros 
 */
public class Aluno {
	private String nome;
	private TCC tcc;
	
	public Aluno(){
		
	}
	public void entregar_etapa(TCC tcc) {
		tcc.setVersao( (tcc.getVersao()+1) );
	}
	
	public void atualizar_cronograma(int dia, String descricao) {
		tcc.getCronograma().setEventos(dia, descricao);
	} 
	
	public String view_cronograma(int dia) {
		return tcc.getCronograma().getEventos(dia);
	} 
	
	public void reportar_problema(String problema) {
		tcc.setProblema(problema);
	}
	
	
	/* GET & SET*/
	public String getNome() {
		return nome;
	}
	 
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public TCC getTcc() {
		return tcc;
	}
	
	public void setTcc(TCC tcc) {
		this.tcc = tcc;
	}
	
	
	
}
