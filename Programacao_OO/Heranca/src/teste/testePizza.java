package teste;
import pizza.*;
public class testePizza {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PizzaBasca basca = new PizzaBasca();
		PizzaRobot robot = new PizzaRobot();
		robot.setPizza(basca);
		robot.amassar();
		robot.produzir();
		robot.levar_ao_fogo();
		robot.retirar_do_fogo();
		robot.embalar();
		
		System.out.println(basca.isEmbalada());
	}

}
