package br.dev.eduardo.tabuada.model;

public class Tabuada {

	private double multiplicando;
	private double minimoMultiplicador;
	private double maximoMultiplicador;

	public void setMultiplicando(double multiplicando) {
		this.multiplicando = multiplicando;
	}

	public double getMultiplicando() {
		return multiplicando;
	}

	public void setMinimoMultiplicador(double minimoMultiplicador) {
		this.minimoMultiplicador = minimoMultiplicador;
	}

	public double getMinimoMultiplicador() {
		return minimoMultiplicador;
	}

	public void setMaximoMultiplicador(double maximoMultiplicador) {
		this.maximoMultiplicador = maximoMultiplicador;
	}

	public double getMaximoMultiplicador() {
		return maximoMultiplicador;
	}

	public void mostrarTabuada() {
		
		double tamanho = (maximoMultiplicador - minimoMultiplicador) + 1;
		
		//(int) está transformando o tamanho que é um double em um int
		
		String[] tabuada = new String[(int) tamanho];
		
		//While é para quando algo acontecer enquanto outra está acontecendo, nesse caso enquanto ocorre a multiplicação, o minimo multiplicador será somado com 1
		while (minimoMultiplicador <= maximoMultiplicador) {
			double produto = multiplicando * minimoMultiplicador;
			System.out.println(multiplicando + " X " + minimoMultiplicador + " = " + produto);
			minimoMultiplicador = minimoMultiplicador + 1;
		}

	}

}
