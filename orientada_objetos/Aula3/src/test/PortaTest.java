package test;

import code.Porta;
import code.utils;

public class PortaTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Porta porta = new Porta();
		porta.abre();
		porta.fecha();
		porta.pinta("azul");
		porta.setDimensoes(123, 12.4, 345.32);
		utils.print(porta);
		
	}

}
