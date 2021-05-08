package br.com.proway.senior.model;

import br.com.proway.senior.model.externo.ICargoFolha;
import br.com.proway.senior.model.externo.IColaboradorFolha;
import br.com.proway.senior.model.externo.IFeriasFolha;
import br.com.proway.senior.model.externo.IPontoFolha;

/**
 * IFolhaBuilder
 * 
 * Especifica um builder de folhas para ser utilizada pelo director.
 * 
 * @author Lucas Grij�
 * @author Lucas Walim
 * @author Marcelo Schaefer
 */	
public interface IFolhaBuilder {
	
	public void iniciarCalculos(IColaboradorFolha colaborador, ICargoFolha cargo);
	public void calcularHorasNormais(IPontoFolha ponto, ICargoFolha cargo);
	public void calcularDescontoNormal(IColaboradorFolha colaborador, ICargoFolha cargo);
	public void calcularHorasFerias(IFeriasFolha feriasFolha);
	public void calcularDescontoFerias(IColaboradorFolha colaborador);
	public Folha build();
}
