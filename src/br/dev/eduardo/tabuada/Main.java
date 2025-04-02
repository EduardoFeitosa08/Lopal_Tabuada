package br.dev.eduardo.tabuada;

import br.dev.eduardo.tabuada.model.Tabuada;
import br.dev.eduardo.tabuada.ui.Menu;

public class Main {

	public static void main(String[] args) {
		
		Tabuada t1 = new Tabuada();
		t1.setMultiplicando(8);
		t1.setMinimoMultiplicador(4);
		t1.setMaximoMultiplicador(6);
		t1.mostrarTabuada();
		
		Menu m1 = new Menu();
		m1.criarMenu();
	}
}
