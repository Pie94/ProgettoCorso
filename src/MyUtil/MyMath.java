package MyUtil;

import java.util.InputMismatchException;
import java.util.Random;

public class MyMath
{
	
	/** 
	 * Ritorna un numero pseudo casuale compreso tra min e max compresi.
	 * @param min Estremo inferiore dei possibili numeri che possono essere ritornati.
	 * @param max Estremo superiore dei possibili numeri che possono essere ritornati.
	 * @return Numero pseudocasuale generato.
	 */
	public static int randInt (int min, int max)
	{
		int num = 0;
		Random rand = new Random(); //oggetto usato per generare l'intero pseudocasuale
		
		num = (Math.abs(rand.nextInt()) % (max + 1 - min)) + min;
		
		return num;
	}
	
	/**
	 * Ritorna la radice quadrata del numero positivo value
	 * @param value Valore positivo di cui si vuole fare la radice quadrata
	 * @return Radice quadrata di value
	 * @throws InputMismatchException Se value è minore di 0, lancia quest'eccezione
	 */
	public static double radiceQuadrata (int value) throws InputMismatchException
	{
		if (value < 0)
			throw new InputMismatchException("Value is negative");
		else
			return Math.sqrt(value);
	}
	
	/**
	 * Ritorna la radice quadrata del numero value
	 * @param value Valore di cui si vuole fare la radice quadrata
	 * @return Radice quadrata di value
	 * @throws InputMismatchException Se value è minore di 0, lancia quest'eccezione
	 */
	public static double radiceQuadrata (double value) throws InputMismatchException
	{
		if (value < 0)
			throw new InputMismatchException("Value is negative");
		else
			return Math.sqrt(value);
	}
	
	/**
	 * Calcola la percentuale "percentage" del valore "num"
	 * @param percentage Percentuale da calcolare (il valore 100 ritorna un valore uguale a num) (Pre-Condizione: dev'essere maggiore di 0)
	 * @param num Valore di cui si vuole calcolare la percentuale "percentage"
	 * @return Percentuale "percentage" del valore "num"
	 * @throws IllegalArgumentException Se il valore di percentage è minore di 0
	 */
	public static double percentOf(double percentage, double num) throws IllegalArgumentException
	{
		if (percentage < 0)
			throw new IllegalArgumentException("percentage is less than 0");
		return (percentage/100) * num;
	}
}
