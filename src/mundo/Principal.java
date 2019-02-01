package mundo;
import java.awt.List;
import java.awt.Point;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;



public class Principal {

	public final static String ARTICLE = "article" ;
	public final static String BOOK = "book" ;
	public final static String BOOKLET = "booklet" ;
	public final static String CONFERENCE = "conference" ;
	public final static String INBOOK = "inbook" ;
	public final static String INCOLLECTION = "incollection" ;
	public final static String INPROCEEDINGS = "inproceedings" ;
	public final static String MANUAL = "manual" ;
	public final static String MASTERSTHESIS = "mastersthesis" ;
	public final static String MISC = "misc" ;
	public final static String PHDTHESIS = "phdthesis" ;
	public final static String PROCEEDINGS = "proceedings" ;
	public final static String TECHREPORT = "techreport" ;
	public final static String UNPUBLISHED = "unpublished" ;


	public int cantArticle ;
	public int cantBook ;
	public int cantBooklet ;
	public int cantConference ;
	public int cantInbook;
	public int cantIncollection ;
	public int cantInproceedings;
	public int cantManual;
	public int cantMastersthesis;
	public int cantMisc;
	public int cantPhdthesis ;
	public int cantProceedings ;
	public int cantTechreport ;
	public int cantUnpublished;
	
	public int erroresPorID ;
	
	
	
	public Principal(){		
		this.cantArticle = 0;
		this.cantBook = 0;
		this.cantBooklet = 0;
		this.cantConference = 0;
		this.cantInbook = 0;
		this.cantIncollection = 0;
		this.cantInproceedings= 0;
		this.cantManual = 0;
		this.cantMastersthesis = 0;
		this.cantMisc = 0;
		this.cantPhdthesis = 0 ;
		this.cantProceedings = 0;
		this.cantTechreport = 0;
		this.cantUnpublished = 0;	
		
		this.erroresPorID = 0 ;
		

	}


	public void cargarArchivo() throws IOException
	{

		File file = new File("./data/test.bib"); 

		BufferedReader br = new BufferedReader(new FileReader(file)); 

		String st; 
		
		while ((st = br.readLine()) != null) 
		{
					
			System.out.println(st); 
			
			
			if(st.startsWith("@"))
			{
				String array[] = st.split("\\{") ;
				String tipo = array[0].substring(1) ;
				
				if (array.length < 2 ){
					erroresPorID++ ;
				}
				
				contarTipoBiblio(tipo);
				
				
			}		
			
		}

		imprimirCantidadesTipo();
		
		imprimirErrores();

	}


	public void contarTipoBiblio(String pTipo)
	{
	
		switch (pTipo)
		{
		case ARTICLE:
			cantArticle++ ;
			break ;
		case BOOK:
			cantBook++;
			break;
		case BOOKLET:
			cantBooklet++ ;
			break ;
		case CONFERENCE:
			cantConference++;
			break ;
		case INBOOK:
			cantInbook++;
			break ;
		case INCOLLECTION:
			cantIncollection++;
			break ;
		case INPROCEEDINGS:
			cantInproceedings++;
			break ;
		case MANUAL:
			cantManual++;
			break ;
		case MASTERSTHESIS:
			cantMastersthesis++;
			break ;
		case MISC:
			cantMisc++;
			break ;
		case PHDTHESIS:
			cantPhdthesis++;
			break ;
		case PROCEEDINGS:
			cantProceedings++;
			break ;
		case TECHREPORT:
			cantTechreport++;
			break ;
		case UNPUBLISHED:
			cantUnpublished++;
			break ;
		
		}
	
	}
	
	public void imprimirCantidadesTipo()
	{
		System.out.println(this.ARTICLE + ":  " + cantArticle);
		System.out.println(this.BOOK + ":  " + cantBook);
		System.out.println(this.BOOKLET + ":  " + cantBooklet);
		System.out.println(this.CONFERENCE + ":  " + cantConference);
		System.out.println(this.INBOOK + ":  " + cantInbook);
		System.out.println(this.INCOLLECTION + ":  " + cantIncollection);
		System.out.println(this.INPROCEEDINGS + ":  " + cantInproceedings);
		System.out.println(this.MANUAL+ ":  " + cantManual);
		System.out.println(this.MASTERSTHESIS + ":  " + cantMastersthesis);
		System.out.println(this.MISC + ":  " + cantMisc);
		System.out.println(this.PHDTHESIS+ ":  " + cantPhdthesis);
		System.out.println(this.PROCEEDINGS + ":  " + cantProceedings);
		System.out.println(this.TECHREPORT+ ":  " + cantTechreport);
		System.out.println(this.UNPUBLISHED+ ":  " + cantUnpublished);
	
	
	}
	
	public void imprimirErrores()
	{
		System.out.println("Bibliografias sin ID: " + erroresPorID);
		
		
		
	}





}
