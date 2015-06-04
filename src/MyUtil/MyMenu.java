package MyUtil;

/**
 * Classe di utilit� per creare un menu standard
 * @author Bassetti Alberto
 *
 */
public class MyMenu 
{
	final private static String CORNICE = "--------------------------------";
	final private static String VOCE_USCITA = "0 -- Esci";
	final private static String RICHIESTA_INSERIMENTO = "Digita il numero dell'opzione desiderata > ";
	private String titolo;
	private String voci [];
	
	/**
	 * Costruttore 
	 * @param _titolo Il titolo del menu
	 * @param _voci Un array contenente le varie voci del menu
	 */
	public MyMenu (String _titolo, String _voci[])
		{
			titolo = _titolo;
			voci = _voci;
		}
	
	/**
	 * Metodo che richiede l'inserimento di un codice che rappresenta l'istruzione richiesta dall'utente
	 * @return Il codice dell'istruzione richiesta dall'utente
	 */
	public int scegli ()
		{
			int istruzioneRichiesta;
			stampa();
			istruzioneRichiesta = MyUtil.leggiInteroCompresoMinMax(RICHIESTA_INSERIMENTO,0,voci.length);
			return istruzioneRichiesta; 
		}
	
	/**
	 * Metodo che stampa a video le voci del menu
	 */
	private void stampa ()
		{
			System.out.println();
			System.out.println(CORNICE);
			System.out.println(titolo);
			System.out.println(CORNICE);
			for (int i=0; i<voci.length; i++)
			{
				System.out.println( (i+1) + " -- " + voci[i]);
			}
			System.out.println();
			System.out.println(VOCE_USCITA);
			System.out.println();
			System.out.println();
		}	
}
