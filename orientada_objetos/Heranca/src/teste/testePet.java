package teste;


import petshop.*;

public class testePet {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		smallDoge p1 = new smallDoge();
		p1.setRaca("chiuaua");
		p1.setNome("bob");
		p1.pedirComida();
		System.out.println(p1);
		while (p1.isHungry()){
			p1.comer();	
		}	
		System.out.println(p1);
		System.out.println("\n -------------------------- \n");
		
		mediumDoge p2 = new mediumDoge();
		p2.setRaca("vira-lata");
		p2.setNome("stuart");
		p2.pedirComida();
		System.out.println(p2);
		while (p2.isHungry()){
			p2.comer();	
		}	
		System.out.println(p2);
		
		System.out.println("\n -------------------------- \n");
		
		mediumDoge p3 = new mediumDoge();
		p3.setRaca("vira-lata");
		p3.setNome("stuart");
		p3.pedirComida();
		System.out.println(p3);
		while (p3.isHungry()){
			p3.comer();	
		}	
		System.out.println(p3);
	}
}
