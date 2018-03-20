package festas;
import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		
		Scanner reader = new Scanner(System.in);  // Reading from System.in
		
		
		Ingresso ingresso = new Ingresso();
		double valor = 0;
		System.out.println("normal(1) ou vip(2)");
		System.out.println("Enter a number: ");
		int n = reader.nextInt(); // Scans the next token of the input as an int.
		
		if (n==2) {
			System.out.println("camarote superior(1) ou camarote inferior(2)");
			System.out.println("Enter a number: ");
			 n = reader.nextInt(); // Scans the next token of the input as an int.
			reader.close();	
			if (n==1) {
				CamaroteSuperior c = new CamaroteSuperior();
				valor = c.valorIngressoVip();
			}else if (n==2) {
				CamaroteInferior c = new CamaroteInferior();
				valor = c.valorIngressoVip();
			}
			System.out.println(valor);
			
		}else {
			reader.close();
			Normal i = new Normal();
			i.imprime();
		}
	
		
		
	}
}
