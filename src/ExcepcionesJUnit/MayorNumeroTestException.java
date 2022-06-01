package  ExcepcionesJUnit;

import org.junit.Test;

public class MayorNumeroTestException
{
	///////////////////////////////////////////////////////////////
	@Test
	public void Excepcion_Mayor_Numero1()
	{	
		// Aqui hago la prueba de la excepcion pero al usar otro tipo de excepcion que no sea "NullPointerException"
		try {
			assertEquals(72, MayorNumero.Excepcion_Mayor_Numero(new int [] { 45, 23, 33, 72 }));
			}catch(NullPointerException e1)
			{
				// Al llegar aqui he dicho que enseñe que ha fallado y mando un mensaje, pero si se quita quedaría igual
				// que el segundo ejemplo
				fail("Fallo en la prueba, salta la excepcion que se espera.");}
	}
	///////////////////////////////////////////////////////////////
	@Test 
	public void Excepcion_Mayor_Numero2()
	{		
		// La siguiente es la excepcion fuera de limites que es la que pedía el enunciado
		try {
			assertEquals(72, MayorNumero.Excepcion_Mayor_Numero_1(new int [] { 45, 23, 33, 72 }));
			}catch(ArrayIndexOutOfBoundsException e2)
			{
				// Si llega aqui es que ha saltado la excepcion como se esperaba y no da error o fallo alguno 
			}
	}
}