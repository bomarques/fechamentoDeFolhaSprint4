package br.com.proway.senior.model.externo;

/**
 * CargoFolha
 * 
 * Objeto cont�ndo os dados necess�rios de um cargo para utiliza��o interna na
 * cria��o de uma folha.
 * 
 * @author sprint3
 */
public class CargoFolha implements ICargoFolha {

	private double salarioBase;
	private double percentualInsalubridade;

	public CargoFolha(double salarioBase, double percentualInsalubridade) {
		this.salarioBase = salarioBase;
		this.percentualInsalubridade = percentualInsalubridade;
	}

	public double getSalarioBase() {
		return salarioBase;
	}

	public double getPercentualInsalubridade() {
		return percentualInsalubridade;
	}
}
