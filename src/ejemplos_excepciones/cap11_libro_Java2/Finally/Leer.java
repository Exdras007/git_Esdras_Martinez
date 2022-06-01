package ejemplos_excepciones.cap11_libro_Java2.Finally;

public class Leer
{
	private String Leer;

	public Leer(String leer)
	{
		super();
		Leer = leer;
	}

	public String getLeer()
	{
		return Leer;
	}

	public void setLeer(String leer)
	{
		Leer = leer;
	}
	
	public static int datoInt()
	{
		int dato = 1;
		return dato;
		
	}

	public static int datoLong()
	{
		return 0;
		
	}
	
	public static String dato()
	{
		return "";
	}

	public static double datoDouble() {
		return 0;
	}
	
}