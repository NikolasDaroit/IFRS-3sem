package agenda;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;

public class Agenda {
	/*
	private HashMap<String, HashMap<String, Integer>> contatos =  new HashMap<String, HashMap<String, Integer>>();
	//				nome 			cnpj	numero
	public void getContato(String nome) {
		for (String key : contatos.get(nome).keySet()) {
		    System.out.println(key);
		}
	}
	public void setContato(String nome,String cnpj, int numero ) {
		HashMap<String, Integer> dados = new HashMap<String, Integer>();
		dados.put(cnpj, numero);
		contatos.put(nome, dados);
	}
	*/
	private ArrayList<Pessoa> contatos = new ArrayList<Pessoa>();

	public boolean add(Pessoa e) {
		return contatos.add(e);
	}

	public void forEach(Consumer<? super Pessoa> action) {
		contatos.forEach(action);
	}

	public Pessoa get(int index) {
		return contatos.get(index);
	}

	public Pessoa set(int index, Pessoa element) {
		return contatos.set(index, element);
	}
	
}
