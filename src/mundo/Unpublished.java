package mundo;

public class Unpublished extends Bibliografia{

	public Unpublished() 
	{
		super();
		requeridos = new String[5] ;
		requeridos[0] = AUTHOR ;
		requeridos[1] = TITLE ;
		requeridos[2] = INSTITUTION ;
		requeridos[3] = YEAR ;
		
		opcionales = new String[7];
		opcionales[0] = TYPE;
		opcionales[1] = NUMBER;
		opcionales[2] = ADDRESS;
		opcionales[3] = MONTH;
		opcionales[4] = NOTE;
		opcionales[5] = KEY;


	}
	
	
	
}
