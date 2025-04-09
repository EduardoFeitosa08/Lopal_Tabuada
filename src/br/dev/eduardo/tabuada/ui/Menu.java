package br.dev.eduardo.tabuada.ui;

import java.util.Scanner;

import br.dev.eduardo.tabuada.model.Tabuada;


public class Menu {
	
	public void criarMenu() {
		
		Scanner leitor1 = new Scanner(System.in);
		Tabuada t1 = new Tabuada();
		
		System.out.print("Escolha o multiplicador: ");
		double multiplicando = leitor1.nextDouble();
		t1.setMultiplicando(multiplicando);
		
		System.out.print("Escolha o Min.multiplicando: ");
		double minimoMultiplicador = leitor1.nextDouble();
		t1.setMinimoMultiplicador(minimoMultiplicador);
		
		System.out.print("Escolha um Max.multiplicador: ");
		double maximoMultiplicador = leitor1.nextDouble();
		t1.setMaximoMultiplicador(maximoMultiplicador);
		
		leitor1.close();
		
		t1.mostrarTabuada();
	}
}
