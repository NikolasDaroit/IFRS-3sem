package petshop;
/*
 * Você deve implementar um sistema de pet Shop e cada pet vai ter 
 * comportamentos diferentes. Você deve ter uma superclasse que vai 
 * conter o tipo e características e métodos comuns como pedir comida. 
 * Você deve ter ao menos 3 tipos de pets diferentes 
 */
public class Pet {
	private int tamanho;
	private double conta;
	private String raca;
	private String nome;
	/**
	 * 
	 * retorna raca
	 */
	public String getRaca() {
		return raca;
	}
	/**
	 * 
	 * define raca
	 */
	public void setRaca(String raca) {
		this.raca = raca;
	}
	/**
	 * 
	 * retorna raca
	 */
	public String getNome() {
		return nome;
	}
	/**
	 * 
	 * define nome
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}
	/**
	 * 
	 * define conta
	 */
	public void setConta(double conta) {
		this.conta = conta;
	}
	/**
	 * 
	 * retorna raca
	 */
	public int getTamanho() {
		return tamanho;
	}
	/**
	 * 
	 * define tamanho
	 */
	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}
	/**
	 * 
	 * retorna raca
	 */
	public int getFome() {
		return fome;
	}
	/**
	 * 
	 * define fome
	 */
	public void setFome(int fome) {
		this.fome = fome;
	}
	/**
	 * 
	 * retorna raca
	 */
	public String getSom() {
		return som;
	}
	/**
	 * 
	 * define som
	 */
	public void setSom(String som) {
		this.som = som;
	}
	private int fome;
	private String som;
	public Pet() {
		fome=0;
		conta=0;
	}
	/**
	 * 
	 * retorna se esta com fome
	 */
	public boolean isHungry() {
		if (fome>0) {
			return true;
		}
		return false;
	}
	/**
	 * 
	 * retorna latido
	 */
	public void pedirComida() {
		System.out.println(som);
	}
	/**
	 * 
	 * retorna raca
	 */
	public double getConta() {
		return conta;
	}
	/**
	 * 
	 * define conta
	 */
	public void setConta(int conta) {
		this.conta = conta;
	}
	/**
	 * 
	 * reduz a fome e aumenta a conta proporcionalmente
	 */
	public void comer() {
		this.fome -=1;
		this.conta+=1.8695;
		
	}
	public String toString() {
		return "\nPET:"+this.getNome()+"\nRACA:"+ this.getRaca()+"\nFOME: "+this.isHungry()+"\nTOTAL: "+this.getConta();
	}
	
}
