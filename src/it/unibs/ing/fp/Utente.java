package it.unibs.ing.fp;

import MyUtil.Genere;

public class Utente extends Persona 
{
	private static final long serialVersionUID = -9077250422645721284L;

	public Utente(String _nome, String _cognome, int ggNascita, int mmNascita, int yyNascita, String _luogoDiNascita, String _numeroTelefono,
			Genere _genere) throws IllegalArgumentException 
	{
		super(_nome, _cognome, ggNascita, mmNascita, yyNascita, _luogoDiNascita, _numeroTelefono, _genere);
	}
	
	public Utente(String _nome, String _cognome, String _dataNascita, String _luogoDiNascita, String _numeroTelefono,
			Genere _genere) throws IllegalArgumentException 
	{
		super(_nome, _cognome, _dataNascita, _luogoDiNascita, _numeroTelefono, _genere);
	}
	
}
