package mundo;

public class Book extends Bibliografia {


	/**
	 * 
	 */
	public Book() 
	{
		super();
		
		requeridos = new String[6] ;		
		requeridos[0] = AUTHOR ;
		requeridos[1] = EDITOR ;
		requeridos[2] = TITLE ;
		requeridos[3] = PUBLISHER ;
		requeridos[4] = YEAR ;
		
		
		opcionales = new String[10];
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
	
	
	
	
}
