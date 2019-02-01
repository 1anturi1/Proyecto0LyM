package mundo;

public class Proceedings extends Bibliografia{


	public Proceedings() 
	{
		super();
		requeridos = new String[3] ;
		requeridos[0] = TITLE ;
		requeridos[1] = YEAR ;
		
		opcionales = new String[11];
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
	
	
	
}
