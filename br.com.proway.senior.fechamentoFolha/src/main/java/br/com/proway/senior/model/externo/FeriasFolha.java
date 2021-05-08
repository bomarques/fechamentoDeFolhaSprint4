package br.com.proway.senior.model.externo;

/**
 * FeriasFolha
 * 
 * Objeto cont�ndo os dados necess�rios de f�rias para utiliza��o interna na
 * cria��o de uma folha.
 * 
 * @author sprint3
 */
public class FeriasFolha implements IFeriasFolha {

	int dias;
	int abono;

	public FeriasFolha(int dias, int abono) {
		this.dias = dias;
		this.abono = abono;
	}

	public int getDias() {
		return dias;
	}

	public int getAbono() {
		return abono;
	}

}
