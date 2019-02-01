package mundo;

public class Manual extends Bibliografia{

	
	public Manual() 
	{
		super();
		
		requeridos = new String[2] ;
		requeridos[0] = TITLE ;
		
		opcionales = new String[8];
		opcionales[0] = AUTHOR ;
		opcionales[0] = ORGANIZATION ;
		opcionales[1] = ADDRESS ;
		opcionales[2] = EDITION ;
		opcionales[3] = MONTH ;
		opcionales[4] = YEAR;
		opcionales[5] = NOTE ;
		opcionales[6] = KEY;


	}
	
	
}
