package imoveis;

import java.util.Scanner;

import festas.CamaroteInferior;
import festas.CamaroteSuperior;
import festas.Ingresso;
import festas.Normal;

public class Main {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);  // Reading from System.in
		
		
		double valor = 0;
		System.out.println("Novo(1) ou Velho(2)");
		System.out.println("Enter a number: ");
		int n = reader.nextInt(); // Scans the next token of the input as an int.
		reader.close();
		if (n==1) {
			Novo ap = new Novo();
			ap.print();
			
		}else if (n==2) {
			Velho ap = new Velho();
			ap.print();
		}

	

	}

}
