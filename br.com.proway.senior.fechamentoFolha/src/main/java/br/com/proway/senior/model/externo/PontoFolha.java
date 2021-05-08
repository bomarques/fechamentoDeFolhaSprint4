package br.com.proway.senior.model.externo;

/**
 * PontoFolha
 * 
 * Objeto cont�ndo os dados necess�rios de pontos para utiliza��o interna na
 * cria��o de uma folha.
 * 
 * @author sprint3
 */
public class PontoFolha implements IPontoFolha {

	private double horasTrabalhadas;
	private double horasExtra;
	private double horasFaltas;

	public PontoFolha(double horasTrabalhadas, double horasExtra, double horasFaltas) {
		this.horasTrabalhadas = horasTrabalhadas;
		this.horasExtra = horasExtra;
		this.horasFaltas = horasFaltas;
	}

	public double getHorasTrabalhadas() {
		return horasTrabalhadas;
	}

	public double getHorasExtra() {
		return horasExtra;
	}

	public double getHorasFaltas() {
		return horasFaltas;
	}

}
