package mundo;

public class Article extends Bibliografia{

	public String linea;
	public String[] requeridos;

	public Article() 
	{
		super();

		requeridos = new String[5] ;		
		requeridos[0] = AUTHOR ;
		requeridos[1] = TITLE ;
		requeridos[2] = JOURNAL ;
		requeridos[3] = YEAR ;
		requeridos[4] = VOLUME ;

		opcionales = new String[6];
		opcionales[0] = NUMBER ;
		opcionales[1] = PAGES ;
		opcionales[2] = MONTH ;
		opcionales[3] = DOI ;
		opcionales[4] = NOTE;
		opcionales[5] = KEY ;


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
