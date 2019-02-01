package mundo;

public class PhdThesis extends Bibliografia{

	
	public PhdThesis() 
	{
		super();
		
		requeridos = new String[5] ;
		requeridos[0] = AUTHOR ;
		requeridos[1] = TITLE ;
		requeridos[2] = SCHOOL ;
		requeridos[3] = YEAR ;
		
		opcionales = new String[6];
		opcionales[0] = TYPE ;
		opcionales[1] = ADDRESS ;		
		opcionales[2] = MONTH ;		
		opcionales[3] = NOTE ;
		opcionales[4] = KEY;


	}
	
	
	
}
