package mundo;

public class Article extends Bibliografia{
	
	
	public Article() 
	{
		super();
		
		requeridos = new String[6] ;		
		requeridos[0] = AUTHOR ;
		requeridos[1] = TITLE ;
		requeridos[2] = JOURNAL ;
		requeridos[3] = YEAR ;
		requeridos[4] = VOLUME ;
		
		opcionales = new String[7];
		opcionales[0] = NUMBER ;
		opcionales[1] = PAGES ;
		opcionales[2] = MONTH ;
		opcionales[3] = DOI ;
		opcionales[4] = NOTE;
		opcionales[5] = KEY ;
		
		
	}
	
	public int contarNumeroErrores(String pLinea)
	{
		int x=0;
		
		
		return x;
	}
	
	
	
	
	
	

}
