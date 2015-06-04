package unitTests;

import it.unibs.ing.fp.*;
import MyUtil.*;
import static org.junit.Assert.*;
import it.unibs.ing.fp.Persona;

import org.junit.Test;

public class TestUtente {
	private static final String EXPECTED_COSTRUTTORE1 = "Nome: Nome%nCognome: Cognome%nData di nascita: 01/01/1990%nLuogo di nascita: SAREZZO%nNumero di telefono: 0308910674%nGenere: MASCHIO%n";
	private static Persona persona = new Utente("Nome", "Cognome", 1, 1, 1990, "SAREZZO", "0308910674", Genere.MASCHIO);

	@Test
	public void testPrimoCostruttorePersona()
	{
		Persona persona1 = new Utente("Nome", "Cognome", 1, 1, 1990, "SAREZZO", "0308910674", Genere.MASCHIO);
		assertEquals(String.format(EXPECTED_COSTRUTTORE1), persona1.toString());
	}

	@Test
	public void testSecondoCostruttorePersona() {
		Persona persona1 = new Utente("Nome", "Cognome", "01/01/1990", "SAREZZO", "0308910674", Genere.MASCHIO);
		assertEquals(String.format(EXPECTED_COSTRUTTORE1), persona1.toString());
	}

	@Test
	public void testGetNome() {
		assertEquals(persona.getNome(), "Nome");
	}

	@Test
	public void testGetCognome() {
		assertEquals(persona.getCognome(), "Cognome");
	}

	@Test
	public void testGetDataNascita() {
		assertEquals(persona.getDataNascita(), "01/01/1990");
	}

	@Test
	public void testGetLuogoNascita() {
		assertEquals(persona.getLuogoNascita(), "SAREZZO");
	}

	@Test
	public void testGetNumeroTelefono() {
		assertEquals(persona.getNumeroTelefono(), "0308910674");
	}

/*	@Test
*	public void testGetCodiceFiscale() {
*		assertEquals(persona.getCodiceFiscale(), "CODICEFISCALE");	DA RIFARE DOPO AVER IMPLEMENTATO MAP
*	}
*/
}
