package ExcepcionesJUnit;

public class MayorNumero
{
	/**
	 * Devuelve el elemento de mayor valor de una lista
	 *
	 * @param list
	 *            Un array de enteros
	 * @return El entero de mayor valor de la lista
	 */

	public static int obt_mayorNumero(int lista[])
	{
		int indice, max = Integer.MIN_VALUE;
		for (indice = 0; indice < lista.length; indice++)
		{
			if (lista[indice] > max)
			{
				max = lista[indice];
			}
		}
		return max;
	}
	
	
	// Aqui he modificado el codigo para que salte una excepcion
	
	public static int Excepcion_Mayor_Numero(int lista[])
	{
		int indice, max = Integer.MIN_VALUE;
		for (indice = 0; indice < lista.length; indice++)
		{
			if (lista[(Integer) null] > max)
			{
				max = lista[indice];
			}
		}
		return max;
	}
	
	// Modifico elcodigo para crear otra excepcion
	
	public static int Excepcion_Mayor_Numero_1(int lista[])
	{
		int indice, max = Integer.MIN_VALUE;
		for (indice = 0; indice < lista.length; indice--)
		{
			if (lista[indice] > max)
			{
				max = lista[indice];
			}
		}
		return max;
	}

}