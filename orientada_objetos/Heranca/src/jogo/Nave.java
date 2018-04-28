package jogo;

public class Nave extends Unidade {
	protected int velocidade;
	
	/**
	 * retorna velocidade
	 * @return int
	 */
	public int getVelocidade() {
		return velocidade;
	}
	/**
	 * 
	 * define velocidade
	 */
	public void setVelocidade(int velocidade) {
		this.velocidade = velocidade;
	}
}
