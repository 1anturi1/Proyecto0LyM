package mundo;

public class InProceedings extends Bibliografia{


	/**
	 * 
	 */
	public InProceedings() 
	{
		super();
		
		requeridos = new String[5] ;		
		requeridos[0] = AUTHOR ;
		requeridos[1] = TITLE ;
		requeridos[2] = BOOKTITLE ;
		requeridos[3] = YEAR ;
		
		opcionales = new String[12];
		opcionales[0] = EDITOR ;
		opcionales[1] = VOLUME ;
		opcionales[2] = NUMBER ;
		opcionales[3] = SERIES ;
		opcionales[4] = PAGES;
		opcionales[5] = ADDRESS ;
		opcionales[6] = MONTH;
		opcionales[7] = ORGANIZATION;
		opcionales[8] = PUBLISHER;
		opcionales[9] = NOTE ;
		opcionales[10] = KEY ;


	}


}
