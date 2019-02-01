package mundo;

public class InCollection extends Bibliografia{
	
	
	public InCollection() 
	{
		super();
		
		requeridos = new String[6] ;		
		requeridos[0] = AUTHOR ;		
		requeridos[1] = TITLE ;
		requeridos[2] = BOOKTITLE ;		
		requeridos[3] = PUBLISHER ;
		requeridos[4] = YEAR ;
		
		opcionales = new String[13];
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
	
	

}
