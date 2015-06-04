package MyUtil;

import java.io.*;
import java.util.*;

/**
 * Classe di utilità generale
 * @author Alberto Bassetti e Pietro Belleri
 *
 */
public class MyUtil 
{
	private static final String NOME_NON_INSERITO = "Attenzione!!! Non è stato inserito alcun nome";
	private static final String MESSAGGIO_ERRORE = "Valore inserito non valido";
	public static final String ACAPO = System.getProperty("line.separator");
	private static Scanner lettore = new Scanner(System.in);
	
	/**
	 * Funzione per leggere un intero (int). Permette di visualizzare un messaggio personalizzato per dire all'utente cosa inserire.
	 * @param messaggio Messaggio da visualizzare prima che l'utente inserisca i dati richiesti
	 * @return Dato letto da tastiera
	 */
	public static int leggiIntero (String messaggio) throws InputMismatchException
	{
		boolean finito = false;
		int dato_in_ingresso = 0;
		do
		{	
			System.out.print(messaggio);
			if (lettore.hasNextInt())
			{	
				dato_in_ingresso = lettore.nextInt();
				finito = true;
			}
			else
			{
				System.out.print(MESSAGGIO_ERRORE);
				lettore.next();
 
			}
		}	while (finito == false);
		
		return dato_in_ingresso;
	}
	
	/**
	 * Funzione per leggere un numero a virgola mobile a doppia precisione (double). Permette di visualizzare un messaggio
	 * personalizzato prima che l'utente immetta i dati richiesti.
	 * @param messaggio Messaggio da visualizzare prima che l'utente immetta i dati richiesti.
	 * @return Valore immesso dall'utente.
	 */
	public static double leggiDouble (String messaggio)
	{
		boolean finito = false;
		System.out.print(messaggio);
		double dato_in_ingresso = 0;
		do
		{	
			System.out.print(messaggio);
			if (lettore.hasNextInt())
			{	
				dato_in_ingresso = lettore.nextDouble();
				finito = true;
			}
			else
			{
				System.out.print(MESSAGGIO_ERRORE);
				lettore.next();
			}
		}	while (finito == false);
		
		return dato_in_ingresso;
	}

	/**
	 * Permette di leggere una stringa immessa dall'utente tramite tastiera. Permette anche di visualizzare un messaggio prima che all'utente 
	 * venga richiesto di immettere i dati richiesti.
	 * @param messaggioRichiestaNome Messaggio da visualizzare prima che l'utente immetta i dati richiesti.
	 * @return Stringa contentente i dati immessi dall'utente.
	 */
	public static String leggiNome(String messaggioRichiestaNome) throws InputMismatchException
	{
		lettore.useDelimiter(ACAPO);
		System.out.print(messaggioRichiestaNome);
		String stringaLetta = lettore.next();
		if (stringaLetta.equals("")){
			throw new InputMismatchException(NOME_NON_INSERITO);
		}
		
		return stringaLetta;
	}
	
	/**
	 * Legge una Stringa da mettere in una lista all'indice i
	 * @param messaggio Messaggio da stampare per la richiesta d'immissione del nome (normalmente deve
	 * contenere lo specificatore di formato %d. Se non lo contiene, usare la funzione leggiNome(String messaggio).
	 * @param i Indice della lista in cui mettere la stringa richiesta
	 * @return Stringa contenente il valore immesso.
	 */
	public static String leggiNome(String messaggio, int i) throws InputMismatchException 
	{
		lettore.useDelimiter(ACAPO);
		System.out.printf(messaggio, i);
		String stringaLetta = lettore.next();
		if (stringaLetta.equals("")){
			throw new InputMismatchException(NOME_NON_INSERITO);
		}
		
		return stringaLetta;
	}
	
	/**
	 * Permette di eseguire una scelta tra due valori predefiniti (Y e N, sia maiuscoli che minuscoli). Permette di visualizzare prima un messaggio a video
	 * @param messaggioRichiestaSelezione Messaggio da visualizzare a video
	 * @return true se la scelta è Y, false se la scelta è N.
	 */
	@SuppressWarnings("resource")
	public static boolean leggiSiONo (String messaggioRichiestaSelezione)
	{
		for (;;)
		{
			Scanner lettore = new Scanner(System.in);
			lettore.useDelimiter("");
			
			System.out.print(messaggioRichiestaSelezione + "(Y/N)");
			char test = lettore.next().toLowerCase().charAt(0);
			if (test == 'y')
			{
				lettore.close();
				return true;
			}
			if (test == 'n')
			{
				lettore.close();
				return false;
			}
			System.out.println();
			System.out.println(MESSAGGIO_ERRORE);
			System.out.println();
		}			
	}

	/**
	 * Funzione che permette di leggere un numero intero che sia compreso tra un valore minimo e uno massimo.
	 * Permette di visualizzare un messaggio personalizzato prima che l'utente immetta i dati richiesti.
	 * I valori minimo e massimo sono compresi nei valori validi.
	 * @param messaggio Messaggio da visualizzare prima che l'utente immetta i dati richiesti. Inserire in questo i valori min e max
	 * @param min Valore minimo di soglia che l'utente può immettere.
	 * @param max Valore massimo di soglia che l'utente può immettere.
	 * @return Valore valido inserito dall'utente.
	 */
	public static int leggiInteroCompresoMinMax (String messaggio, int min, int max) 
	{
		boolean finito = false;
		int dato_in_ingresso = 0;
		do
		{	
			System.out.print(messaggio);
			if (lettore.hasNextInt())
			{	
				dato_in_ingresso = lettore.nextInt();
				if (dato_in_ingresso >= min && dato_in_ingresso <= max)
					finito = true;
				else
				{
					System.out.println(MESSAGGIO_ERRORE);
				}
			}
			else
			{
				System.out.println(MESSAGGIO_ERRORE);
				lettore.next();
			}
		}	while (!finito);
	
		return dato_in_ingresso;
	}
	
	/**
	 * Funzione che permette di leggere un numero a virgola mobile a doppia precisione (double) che sia compreso 
	 * tra un valore minimo e uno massimo.Permette di visualizzare un messaggio personalizzato prima che l'utente 
	 * immetta i dati richiesti. I valori minimo e massimo sono compresi nei valori validi.
	 * @param messaggio Messaggio da visualizzare prima che l'utente immetta i dati richiesti.
	 * @param min Valore minimo di soglia che l'utente può immettere.
	 * @param max Valore massimo di soglia che l'utente può immettere.
	 * @return Valore valido inserito dall'utente.
	 */
	public static double leggiDoubleCompresoMinMax (String messaggio, double min, double max) 
	{
		boolean finito = false;
		double dato_in_ingresso = 0;
		do
		{	
			System.out.print(messaggio);
			if (lettore.hasNextDouble())
			{	
				dato_in_ingresso = lettore.nextDouble();
				if (dato_in_ingresso >= min && dato_in_ingresso <= max)
					finito = true;
				else
				{
					System.out.print(MESSAGGIO_ERRORE);
				}
			}
			else
			{
				System.out.print(MESSAGGIO_ERRORE);
				lettore.next();
			}
		}	while (finito == false);
	
		return dato_in_ingresso;
	}
	
	/**
	 * Decrementa un valore intero di un'unitÃ  a meno che questo sia minore o uguale ad un valore minimo fissato.
	 * @param num Numero da decrementare.
	 * @param minimo Limite minimo per il decremento.
	 * @return Se num è minore o uguale a minimo, allora ritorna il valore di minimo. Altrimenti ritorna num decrementato di un'unità
	 */
	public static int decrementoConLimiteMinimo (int num, int minimo)
	{
		if (num <= minimo)
			return minimo;
		else
			return num--;
	}
	
	/**
	 * Stampa un messaggio di errore.
	 * @param messaggio Messaggio da visualizzare.
	 */
	public static void erroreRichiestaIstruzione(String messaggio) 
	{
		System.out.print(messaggio);
	}
	
	public static void benvenuti (String messaggio)
	{
		System.out.println("Benvenuti!");
		System.out.println(messaggio);
		System.out.println();
	}
	
	public static void saluti (String messaggio)
	{
		System.out.println(messaggio);
		System.out.println();
	}
	
	/**
	 * Date due stringe, controlla che stringa2 sia contenuta in una parte di striga1
	 * @param stringa1 Stringa di cui si vuole confrontare il contenuto
	 * @param stringa2 Stringa di riferimento per fare il confronto. Si vuole testare se questa è contenuta all'interno di stringa1
	 * @return true se stringa2 è contenuta in stringa1, altrimenti false
	 */
	public static boolean contentEqualsIgnoreCase (String stringa1, String stringa2)
	{
		stringa1 = stringa1.toLowerCase();
		stringa2 = stringa2.toLowerCase();
		
		StringBuffer daConfrontare = new StringBuffer (stringa2);
		return stringa1.contentEquals(daConfrontare);
	}
	
	
	public static boolean verificaData (String data)
	{
		int gg = Integer.parseInt(data.substring(0,	2));
		int mm = Integer.parseInt(data.substring(3, 5));
		int yy = Integer.parseInt(data.substring(6, 10));
		
		if (gg < 0 || mm < 0 || gg > 31 || mm > 12) return false;
		
		switch (mm)
		{
			case 1:
				return true; //si è gia verificato con l'if di prima che questa data vale
				
			case 2:
				if (annoBisestile(yy))
				{
					if (gg > 31) return false;
					else return true;
				}
				else
				{
					if (gg > 28) return false;
					else return true;
				}
				
			case 3:
				return true; //si è gia verificato con l'if di prima che questa data vale
				
			case 4:
				if (gg > 30) return false;
				else return true;
				
			case 5:
				return true;
				
			case 6:
				if (gg > 30) return false;
				else return true;
				
			case 7:
				return true;
				
			case 8:
				return true;
				
			case 9:
				if (gg > 30) return false;
				else return true;
				
			case 10:
				return true;
				
			case 11:
				if (gg > 30) return false;
				else return true;
				
			case 12:
				return true;
				
			default:
				break;				
		}
		
		return false;
	}

	public static boolean annoBisestile(int yy) {
		if (yy % 400 == 0 || (yy % 100 != 0 && yy % 4 == 0))
			return true;
		else
			return false;
	}
	
	public static boolean verificaData (int gg, int mm , int yy)
	{
		if (gg < 0 || mm < 0 || gg > 31 || mm > 12) return false;
		
		switch (mm)
		{
			case 1:
				return true; //si è gia verificato con l'if di prima che questa data vale
				
			case 2:
				if (annoBisestile(yy))
				{
					if (gg > 31) return false;
					else return true;
				}
				else
				{
					if (gg > 28) return false;
					else return true;
				}
				
			case 3:
				return true; //si è gia verificato con l'if di prima che questa data vale
				
			case 4:
				if (gg > 30) return false;
				else return true;
				
			case 5:
				return true;
				
			case 6:
				if (gg > 30) return false;
				else return true;
				
			case 7:
				return true;
				
			case 8:
				return true;
				
			case 9:
				if (gg > 30) return false;
				else return true;
				
			case 10:
				return true;
				
			case 11:
				if (gg > 30) return false;
				else return true;
				
			case 12:
				return true;
				
			default:
				break;				
		}
		
		return false;
	}
	
	/**
	 * Metodo per creare un DataInputStream di un File "file" e leggerne quindi i dati in formato binario
	 * @param file File da cui si vogliono leggere i dati
	 * @return DataInputStream relativo a "file"
	 * @throws FileNotFoundException Nel caso in cui il File "file" non esista, viene lanciata questa eccezione
	 * @throws IllegalArgumentException Se "file" è una cartella, viene lanciata questa eccezione
	 */
	public static DataInputStream createDataInputStreamFile (File file) throws FileNotFoundException, IllegalArgumentException
	{
		if (file.isDirectory())
			throw new IllegalArgumentException("File is a directory");
		return new DataInputStream(
				new BufferedInputStream(
						new FileInputStream(file)));
	}
	
	/**
	 * Metodo per creare un DataOutputStream di un File "file" per poterci scrivere dei dati in formato binario
	 * @param file File su cui si vogliono scrivere i dati
	 * @return DataOutputStream relativo a "file"
	 * @throws FileNotFoundException Nel caso in cui il File "file" non esista, viene lanciata questa eccezione
	 * @throws IllegalArgumentException Se "file" è una cartella, viene lanciata questa eccezione
	 */
	public static DataOutputStream createDataOutputStreamFile (File file) throws FileNotFoundException, IllegalArgumentException
	{
		if (file.isDirectory())
			throw new IllegalArgumentException("File is a directory");
		return new DataOutputStream(
				new BufferedOutputStream(
						new FileOutputStream(file)));
	}
	
	/**
	 * Metodo per creare un PrintWriter in grado di scrivere una Stringa in caratteri Unicode su un File "file"
	 * @param file File su cui si vuole scrivere il testo
	 * @return l'oggetto PrintWriter relativo a "file"
	 * @throws IllegalArgumentException Nel caso in cui "file" sia una directory
	 * @throws IOException Se il file esiste ma è una directory
	 * @throws FileNotFoundException Se il file non esiste
	 */
	public static PrintWriter createPrintWriterFile (File file) throws IllegalArgumentException, IOException, FileNotFoundException
	{
		if (file.isDirectory())
			throw new IllegalArgumentException("File is a directory");
		return new PrintWriter (
				new BufferedWriter(
						new FileWriter(file)));
	}
	
	/**
	 * Metodo per creare un oggetto Scanner in grado di leggere una Stringa di caratteri Unicode su un File "file"
	 * @param file File su cui si vuole scrivere il testo
	 * @return l'oggetto Scanner relativo a "file"
	 * @throws IllegalArgumentException Caso in cui "file" sia una directory
	 * @throws FileNotFoundException Caso in cui il file indicato da "file" non esista
	 */
	public static Scanner createScannerFile (File file) throws IllegalArgumentException, FileNotFoundException
	{
		if (file.isDirectory())
			throw new IllegalArgumentException("File is a directory");
		Scanner scanner = new Scanner(new FileReader(file));
		scanner.useDelimiter(ACAPO);
		return scanner;
	}
}