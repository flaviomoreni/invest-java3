package br.com.fiap.investimento.test;

import java.util.ArrayList;
import java.util.Iterator;

public class StringListTest {

	public static void main(String[] args) {
		
		ArrayList<String> lista = new ArrayList<String>(); 
		lista.add("Victor");
		lista.add("Fl�vio");
		lista.add("Giovanna");
		lista.add("Marih�");

		lista.add(2, "Lucas");
		lista.set(1, "Moreni");

		
		// foreach
		for (String nome : lista) {
			System.out.println(nome);
		}
		
		
		System.out.println( lista.contains("Giovana") );
		System.out.println( lista.contains("Giovanna") );
		
		System.out.println( lista.indexOf("Fl�vio"));
		System.out.println( lista.indexOf("Marih�"));
		System.out.println( lista.indexOf("Ederson"));
		
		
		lista.remove("Marih�");
		
		
		
		
		/*
		//for b�sico
		for(int i = 0; i < lista.size(); i++ ) {
			String nome = lista.get(i);
			System.out.println(nome);
		}
		
		
		
		// iterator
		Iterator<String> ite = lista.iterator();
		while( ite.hasNext() ) {
			String nome = ite.next();
			System.out.println(nome);
		}
		*/
		
	}

}