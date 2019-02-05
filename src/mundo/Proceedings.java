package mundo;

public class Proceedings extends Bibliografia{


	public Proceedings() 
	{
		super();
		requeridos = new String[2] ;
		requeridos[0] = TITLE ;
		requeridos[1] = YEAR ;
		
		opcionales = new String[10];
		opcionales[0] = EDITOR;
		opcionales[1] = VOLUME;
		opcionales[2] = NUMBER;
		opcionales[3] = SERIES;
		opcionales[4] = ADDRESS;
		opcionales[5] = MONTH;
		opcionales[6] = PUBLISHER;
		opcionales[7] = ORGANIZATION;
		opcionales[8] = NOTE;
		opcionales[9] = KEY;


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
