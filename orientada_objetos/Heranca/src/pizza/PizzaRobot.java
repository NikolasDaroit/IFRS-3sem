package pizza;
/*
 *Você precisa fazer um sistema para um robô fazedor de pizzas ele vai ter 
 *métodos genéricos para amassar a massa, levar ao fogo e etc. 
 *Você também deve poder adicionar ingredientes cada tipo de pizza deve 
 *possuir ordem dos ingredientes diferenciadas. 
 *Deve-se ter ao menos 4 tipos de pizza. 
 * 
 */
public class PizzaRobot {
	/**
	 * 
	 * retorna pizza
	 */
	public Pizza getPizza() {
		return pizza;
	}
	/**
	 * 
	 * define pizza
	 */
	public void setPizza(Pizza pizza) {
		this.pizza = pizza;
	}
	private Pizza pizza;
	/**
	 * 
	 * define estado da massa para amassado (1)
	 */
	public void amassar() {
		pizza.setMassa(1);
	}
	/**
	 * 
	 * adiciona ingredientes da receita
	 */
	public void produzir() {
		for (String ingrediente : pizza.getReceita()) {
			if (!pizza.haveIngrediente(ingrediente))
				pizza.addIngrediente(ingrediente);
		}
	}
	/**
	 * 
	 * define estado da massa para assado (2)
	 */
	public void levar_ao_fogo() {
		if (pizza.getMassa()==1 && pizza.getLenIngredientes() > 0) {
			pizza.setMassa(2);
		}
	}
	/**
	 * 
	 * define que esta pronto
	 */
	public void retirar_do_fogo() {
		if (pizza.getMassa() == 2) {
			pizza.setPronto(true);
		}
		
	}
	/**
	 * 
	 * define que esta embalada
	 */
	public void embalar() {
		if (pizza.isPronto()) {
			pizza.setEmbalada(true);
		}
		
	}
	
}
