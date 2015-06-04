package it.unibs.ing.fp;

import MyUtil.Genere;
import MyUtil.TipologiaMedico;

public class PersonaleMedico extends Persona
{
	private static final long serialVersionUID = 5025982073967807737L;
	private static int numeroIscrizione; 
	private static TipologiaMedico tipologiaMedico;
	
	public PersonaleMedico (String _nome, String _cognome, String _dataNascita, String _luogoDiNascita, 
			String _numeroTelefono, Genere _genere, int _numeroIscrizione, TipologiaMedico _tipologiaMedico) throws IllegalArgumentException
	{
		super(_nome, _cognome, _dataNascita, _luogoDiNascita, _numeroTelefono, _genere);
		numeroIscrizione = _numeroIscrizione;
		tipologiaMedico = _tipologiaMedico;		
	}
	
	public PersonaleMedico (String _nome, String _cognome, int ggNascita, int mmNascita, int yyNascita, String _luogoDiNascita, 
			String _numeroTelefono, Genere _genere, int _numeroIscrizione, TipologiaMedico _tipologiaMedico) throws IllegalArgumentException
	{
		super(_nome, _cognome, ggNascita, mmNascita, yyNascita, _luogoDiNascita, _numeroTelefono,
				 _genere);
		numeroIscrizione = _numeroIscrizione;
		tipologiaMedico = _tipologiaMedico;		
	}
	
	public String toString()
	{
		String valori = super.toString();
		
		valori = valori + String.format("Numero iscrizione: %06d%n", numeroIscrizione);
		valori = valori + String.format("Tipologia medico: %s%n", tipologiaMedico.toString());
		
		return valori;
	}
	
	public int getNumeroIscrizione()
	{
		return numeroIscrizione;
	}
	
	public TipologiaMedico getTipologiaMedico()
	{
		return tipologiaMedico;
	}
	
}
