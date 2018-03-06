
public class Cronograma {
	private String evento[] = new String[360];
	/* GET & SET*/


	public String getEventos(int dia) {
		return evento[dia];
	}

	public void setEventos(int dia, String descricao) {
		this.evento[dia] = descricao;
	}

	


	

}
