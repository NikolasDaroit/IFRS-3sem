package pizza;
import java.util.ArrayList;
import java.util.List;

public class Pizza {
	private List<String> receita = new ArrayList<String>();
	public List<String> getReceita() {
		return receita;
	}
	/**
	 * 
	 * define receita
	 */
	public void setReceita(String receita) {
		this.receita.add(receita);
	}
	private List<String> ingredientes = new ArrayList<String>();
	private int massa;
	private boolean pronto;
	private boolean embalada; 
	
	public Pizza() {
		massa = 0;
		pronto=false;
		embalada=false;
	}
	/**
	 * 
	 * retorna se esta pronta
	 */
	public boolean isPronto() {
		return pronto;
	}
	/**
	 * 
	 * define se esta pronta
	 */
	public void setPronto(boolean pronto) {
		this.pronto = pronto;
	}
	/**
	 * 
	 * retorna se esta embalada
	 */
	public boolean isEmbalada() {
		return embalada;
	}
	/**
	 * 
	 * define se esta embalada
	 */
	public void setEmbalada(boolean embalada) {
		this.embalada = embalada;
	}
	/**
	 * 
	 * adiciona um ingrediente
	 */
	public void addIngrediente(String ingrediente) {
		ingredientes.add(ingrediente);
	}
	/**
	 * 
	 * define o estado da massa
	 */
	public void setMassa(int i) {
		this.massa=i;
	}
	/**
	 * 
	 * retorna os ingredientes
	 */
	public List<String> getIngredientes() {
		return ingredientes;
	}
	/**
	 * 
	 * verifica se possui o ingrediente
	 */
	public boolean haveIngrediente(String ingrediente) {
		for (String ing : ingredientes) {
			if( ingrediente.equals(ing) ) {
				return true;
			}
		}
		return false;
	}
	/**
	 * 
	 * retorna a quantidade de ingredientes
	 */
	public int getLenIngredientes() {
		return ingredientes.size();
	}
	/**
	 * 
	 * define os ingredientes
	 */
	public void setIngredientes(List<String> ingredientes) {
		this.ingredientes = ingredientes;
	}
	
	/**
	 * 
	 * retorna estado conta
	 */
	public int getMassa() {
		return massa;
	}
}
