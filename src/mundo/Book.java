package mundo;

public class Book extends Bibliografia {


	/**
	 * 
	 */
	public Book() 
	{
		super();
		
		requeridos = new String[5] ;		
		requeridos[0] = AUTHOR ;
		requeridos[1] = EDITOR ;
		requeridos[2] = TITLE ;
		requeridos[3] = PUBLISHER ;
		requeridos[4] = YEAR ;
		
		
		opcionales = new String[9];
		opcionales[0] = VOLUME ;
		opcionales[1] = NUMBER ;
		opcionales[2] = SERIES ;
		opcionales[3] = ADDRESS ;
		opcionales[4] = EDITION ;
		opcionales[5] = MONTH;
		opcionales[6] = NOTE ;
		opcionales[7] = KEY ;
		opcionales[8] = URL ;
		
	}
	
	public String contarNumeroErroresRequeridos(String pLinea)
	{
		String x="";
		
		String linea = pLinea.toLowerCase();
		System.out.println(linea);
		for(int i = 0;i<requeridos.length;i++)
		{
			String buscar = requeridos[i];
	        if(linea.contains(buscar))
	        {
	        	x=x+"Si esta "+buscar+"\n";
	        }
	        else
	        {
	        	x=x+"No esta "+buscar+"\n";
	        }
		}
		System.out.println(x);
		return x;
	}
	
	public void numeroDeCorchetes(String pLinea)
	{
		boolean x= true;
		String linea = pLinea;
		String corchete1 = "{";
		String corchete2 = "}";		
		String[] arr = linea.split("=") ;
		for (int j = 1; j != arr.length; j++) {
			
			if(arr[j].contains(corchete1) && arr[j].contains(corchete2))
			{
				x= x & true;
			}
			else
			{
				x = false ;
			}

		}

		if(x)
		{
			System.out.println("Los corchetes estan completos");
		}
		else
		{
			System.out.println("En algun campo faltan corchetes");
		}
	}
	
}
