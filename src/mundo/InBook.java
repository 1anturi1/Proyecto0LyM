package mundo;

public class InBook extends Bibliografia{

	
	
	
	public InBook() 
	{
		super();
		
		requeridos = new String[8] ;		
		requeridos[0] = AUTHOR ;
		requeridos[1] = EDITOR ;
		requeridos[2] = TITLE ;
		requeridos[3] = CHAPTER ;
		requeridos[4] = PAGES ;
		requeridos[5] = PUBLISHER ;
		requeridos[6] = YEAR ;
		
		opcionales = new String[10];
		opcionales[0] = VOLUME ;
		opcionales[1] = NUMBER ;
		opcionales[2] = SERIES ;
		opcionales[3] = TYPE ;
		opcionales[4] = ADDRESS;
		opcionales[5] = EDITION ;
		opcionales[6] = MONTH ;
		opcionales[7] = NOTE ;
		opcionales[8] = KEY ;
		
	}
	
	
	
}
