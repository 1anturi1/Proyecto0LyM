package mundo;

public class Booklet extends Bibliografia{

	

	/**
	 * 
	 */
	public Booklet() 
	{
		super();
		
		requeridos = new String[2] ;		
		requeridos[0] = TITLE ;		
		
		opcionales = new String[8];
		opcionales[0] = AUTHOR ;
		opcionales[1] = HOWPUBLISHED ;
		opcionales[2] = ADDRESS ;
		opcionales[3] = MONTH ;
		opcionales[4] = YEAR ;		
		opcionales[5] = NOTE ;
		opcionales[6] = KEY ;
		
		
	}
	
	
}
