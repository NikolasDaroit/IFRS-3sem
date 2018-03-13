package teste;

import jogo.NaveAnfibio;

public class testeUnidade {
	public static void main(String[] args) {
		NaveAnfibio peixeVoador = new NaveAnfibio();
		peixeVoador.setVida(50);
		peixeVoador.setVelocidade(23789);
		peixeVoador.setVelocidadeAgua(233);
		
		System.out.println(peixeVoador.getVida());
		System.out.println(peixeVoador.getVelocidade());
		System.out.println(peixeVoador.getVelocidadeAgua());
	}
}
