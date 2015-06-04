package it.unibs.ing.fp;

import java.io.Serializable;

import MyUtil.*;

public abstract class Persona implements Serializable
{

	private static final long serialVersionUID = 5403369953440900900L;
	private String nome;
	private String cognome;
	private String dataNascita;
	private String luogoDiNascita;
	private String numeroTelefono;
	private Genere genere;
	
	public Persona (String _nome, String _cognome, int ggNascita, int mmNascita, int yyNascita, String _luogoDiNascita, 
			String _numeroTelefono, Genere _genere) throws IllegalArgumentException
	{
		if (!MyUtil.verificaData(ggNascita, mmNascita, yyNascita))
			throw new IllegalArgumentException("Data immessa non valida");
		nome = _nome;
		cognome = _cognome;
		dataNascita = String.format("%02d/%02d/%04d", ggNascita, mmNascita, yyNascita);
		luogoDiNascita = _luogoDiNascita;
		numeroTelefono = _numeroTelefono;
		genere = _genere;
	}
	
	public Persona (String _nome, String _cognome, String _dataNascita, String _luogoDiNascita, 
			String _numeroTelefono, Genere _genere) throws IllegalArgumentException
	{
		if (!MyUtil.verificaData(_dataNascita))
			throw new IllegalArgumentException ("Data immessa non valida");
		nome = _nome;
		cognome = _cognome;
		dataNascita = _dataNascita;
		luogoDiNascita = _luogoDiNascita;
		numeroTelefono = _numeroTelefono;
		genere = _genere;
	}
	
	public String getNome()
	{
		return nome;
	}
	
	public String getCognome()
	{
		return cognome;
	}
	
	public String getDataNascita()
	{
		return dataNascita;
	}
	
	public String getLuogoNascita()
	{
		return luogoDiNascita;
	}
	
	public String getNumeroTelefono ()
	{
		return numeroTelefono;
	}
	
	public String getGenere ()
	{
		return genere.toString();
	}
	
	public String toString()
	{
		String valori;
		
		valori = String.format("Nome: %s%n", nome);
		valori = valori + String.format("Cognome: %s%n", cognome);
		valori = valori + String.format("Data di nascita: %s%n", dataNascita);
		valori = valori + String.format("Luogo di nascita: %s%n", luogoDiNascita);
		valori = valori + String.format("Numero di telefono: %s%n", numeroTelefono);
		valori = valori + String.format("Genere: %s%n", genere.toString());
		//valori = valori + String.format("Codice fiscale: %s%n", codiceFiscale); MODIFICARE PER QUANDO SI USERA LA LISTA MAP 
		
		return valori;
	}
}
