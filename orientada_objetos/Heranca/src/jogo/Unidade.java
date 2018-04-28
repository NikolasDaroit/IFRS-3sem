package jogo;
/*
 * Você foi incumbido de desenvolver um jogo de estratégia online e 
 * deve modelar os tipos de unidades de guerra. Você tem unidades 
 * terrestre aéreas e aquáticas. Além disso você tem unidades que 
 * são pessoas e unidades que são máquinas. Você deve ter ao 
 * mínimo 3 níveis de herança e métodos distintos.
 */

public class Unidade {
	private int vida;
	/**
	 * 
	 * retorna vida
	 */
	public int getVida() {
		return vida;
	}
	/**
	 * 
	 * define vida
	 */
	public void setVida(int vida) {
		this.vida = vida;
	}

}
