package jogo;
/*
 * Voc� foi incumbido de desenvolver um jogo de estrat�gia online e 
 * deve modelar os tipos de unidades de guerra. Voc� tem unidades 
 * terrestre a�reas e aqu�ticas. Al�m disso voc� tem unidades que 
 * s�o pessoas e unidades que s�o m�quinas. Voc� deve ter ao 
 * m�nimo 3 n�veis de heran�a e m�todos distintos.
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
