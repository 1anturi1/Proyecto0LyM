package mundo;

public class InProceedings extends Bibliografia{


	/**
	 * 
	 */
	public InProceedings() 
	{
		super();
		
		requeridos = new String[4] ;		
		requeridos[0] = AUTHOR ;
		requeridos[1] = TITLE ;
		requeridos[2] = BOOKTITLE ;
		requeridos[3] = YEAR ;
		
		opcionales = new String[11];
		opcionales[0] = EDITOR ;
		opcionales[1] = VOLUME ;
		opcionales[2] = NUMBER ;
		opcionales[3] = SERIES ;
		opcionales[4] = PAGES;
		opcionales[5] = ADDRESS ;
		opcionales[6] = MONTH;
		opcionales[7] = ORGANIZATION;
		opcionales[8] = PUBLISHER;
		opcionales[9] = NOTE ;
		opcionales[10] = KEY ;


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
	        	x=x+"No esta "+buscar;
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
