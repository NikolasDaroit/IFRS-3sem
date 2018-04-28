package test;
import code.Funcionario;
import code.utils;

public class FuncionarioTeste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		testaFuncionario();
		testaFuncionariosIguais();
		testaFuncionariosComMesmaReferencia();
	}
	
	public static void testaFuncionario(){
		utils.print("\nINICIO testaFuncionario");
		Funcionario meuFuncionario = new Funcionario();
	    meuFuncionario.bonifica(100);
	    mostra(meuFuncionario);
	    meuFuncionario.setData("31/12/2015");
	    mostra(meuFuncionario);

	    utils.print(  String.valueOf(meuFuncionario.getSalario() ));
	    utils.print("FIM testaFuncionario\n");
	}
	public static void testaFuncionariosIguais(){
		utils.print("\nINICIO testaFuncionariosIguais");
	    Funcionario f1 = new Funcionario();
	    f1.setNome("Pedro"); 
	    f1.setSalario(1230); 
	    mostra(f1);
	    Funcionario f2 = new Funcionario();
	    f2.setNome("Rodrigo"); 
	    f2.setSalario(1780); 
	    mostra(f2);


	   if (f1.iguais(f2)){
	       System.out.println("Os funcionários são iguais");
	   } else{
	       System.out.println("Os funcionários são diferentes");
	   }
	   if (f1.iguais(null)){
	       System.out.println("Os funcionários são iguais");
	   } else{
	       System.out.println("Voce comparou com null");
	   }
	   utils.print("FIM testaFuncionariosIguais\n");
	  }
	
	public static void testaFuncionariosComMesmaReferencia(){
		utils.print("\nINICIO testaFuncionariosComMesmaReferencia");
		Funcionario f1 = new Funcionario();
		f1.setNome("Pedro"); 
	    f1.setSalario(1230); 
		Funcionario f2 = f1; 
		if (f1.iguais(f2)){
		       System.out.println("Os funcionários são iguais");
		   } else{
		       System.out.println("Os funcionários são diferentes");
		   }
		utils.print("FIM testaFuncionariosComMesmaReferencia\n");

	}
	
	public static void mostra(Funcionario funcionario){
	      
	    funcionario.mostra();
	    
	  }

}
