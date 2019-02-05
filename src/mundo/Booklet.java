package mundo;

public class Booklet extends Bibliografia{

	

	/**
	 * 
	 */
	public Booklet() 
	{
		super();
		
		requeridos = new String[1] ;		
		requeridos[0] = TITLE ;		
		
		opcionales = new String[7];
		opcionales[0] = AUTHOR ;
		opcionales[1] = HOWPUBLISHED ;
		opcionales[2] = ADDRESS ;
		opcionales[3] = MONTH ;
		opcionales[4] = YEAR ;		
		opcionales[5] = NOTE ;
		opcionales[6] = KEY ;
		
		
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
