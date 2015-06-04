package unitTests;

import static org.junit.Assert.*;
import it.unibs.ing.fp.*;

import org.junit.Test;

import MyUtil.Genere;
import MyUtil.TipologiaMedico;

public class PersonaleMedicoTest 
{
	private static final String EXPECTED_COSTRUTTORE = "Nome: Nome%nCognome: Cognome%nData di nascita: 01/01/1990%nLuogo di nascita: SAREZZO%nNumero di telefono: 0308910674%nGenere: MASCHIO%nNumero iscrizione: 123456%nTipologia medico: SPECIALISTA%n";
	private static Persona persona = new PersonaleMedico("Nome", "Cognome", 1, 1, 1990, "SAREZZO", "0308910674", Genere.MASCHIO, 123456, TipologiaMedico.SPECIALISTA);
	
	@Test
	public void testCostruttore1() 
	{
		persona = new PersonaleMedico("Nome", "Cognome", 1, 1, 1990, "SAREZZO", "0308910674", Genere.MASCHIO, 123456, TipologiaMedico.SPECIALISTA);
		assertEquals(String.format(EXPECTED_COSTRUTTORE), persona.toString());
	}

	@Test
	public void testCostruttore2() 
	{
		persona = new PersonaleMedico("Nome", "Cognome", "01/01/1990", "SAREZZO", "0308910674", Genere.MASCHIO, 123456, TipologiaMedico.SPECIALISTA);
		assertEquals(String.format(EXPECTED_COSTRUTTORE), persona.toString());
	}

	@Test
	public void testGetNome() 
	{
		assertEquals(persona.getNome(), "Nome");
	}

	@Test
	public void testGetCognome() 
	{
		assertEquals(persona.getCognome(), "Cognome");
	}

	@Test
	public void testGetDataNascita() 
	{
		assertEquals(persona.getDataNascita(), "01/01/1990");
	}

	@Test
	public void testGetLuogoNascita() 
	{
		assertEquals(persona.getLuogoNascita(), "SAREZZO");
	}

	@Test
	public void testGetNumeroTelefono() 
	{
		assertEquals(persona.getNumeroTelefono(), "0308910674");
	}

/*	@Test
*	public void testGetCodiceFiscale() 
*	{
*		assertEquals(persona.getCodiceFiscale(), "CODICEFISCALE");			DA RIFARE PER QUANDO SI IMPLEMENTERà L'INTERFACCIA MAP
*	}
*/
	@Test
	public void testGetNumeroIscrizione() 
	{
		assertEquals(((PersonaleMedico) persona).getNumeroIscrizione(), 123456);
	}

	@Test
	public void testGetTipologiaMedico() 
	{
		assertEquals(((PersonaleMedico) persona).getTipologiaMedico(), TipologiaMedico.SPECIALISTA);
	}	
}
