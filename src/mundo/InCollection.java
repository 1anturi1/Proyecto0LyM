package mundo;

public class InCollection extends Bibliografia{
	
	
	public InCollection() 
	{
		super();
		
		requeridos = new String[5] ;		
		requeridos[0] = AUTHOR ;		
		requeridos[1] = TITLE ;
		requeridos[2] = BOOKTITLE ;		
		requeridos[3] = PUBLISHER ;
		requeridos[4] = YEAR ;
		
		opcionales = new String[12];
		opcionales[0] = EDITOR ;
		opcionales[1] = VOLUME ;
		opcionales[2] = NUMBER ;
		opcionales[3] = SERIES ;
		opcionales[4] = TYPE;
		opcionales[5] = CHAPTER ;
		opcionales[6] = PAGES ;
		opcionales[7] = ADDRESS ;
		opcionales[8] = EDITION ;
		opcionales[9] = MONTH ;
		opcionales[10] = NOTE ;
		opcionales[11] = KEY ;
		
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
