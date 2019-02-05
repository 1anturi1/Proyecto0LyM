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

	public Article art;
	public Book book;
	public Booklet booklet;
	public Conference conference;
	public InBook inbook;
	public InCollection incollection;
	public InProceedings inproceedings;
	public Manual manual;
	public MastersThesis masterthesis;
	public Misc misc;
	public PhdThesis phd;
	public Proceedings proceedings;
	public TechReport techrep;
	public Unpublished unpublished;
	
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

		this.art = new Article();
		this.book = new Book();
		this.booklet = new Booklet();
		this.conference = new Conference();
		this.inbook = new InBook();
		this.incollection = new InCollection();
		this.inproceedings = new InProceedings();
		this.manual = new Manual();
		this.masterthesis = new MastersThesis();
		this.misc = new Misc();
		this.phd = new PhdThesis();
		this.proceedings = new Proceedings();
		this.techrep = new TechReport();
		this.unpublished = new Unpublished();
		
		this.erroresPorID = 0 ;

	}


	public void cargarArchivo() throws IOException
	{

		File file = new File("./data/test.bib"); 

		BufferedReader br = new BufferedReader(new FileReader(file)); 

		String st = br.readLine(); 
		
		String biblio = "" ;
		

		while (st != null) 
		{
			
			

			//System.out.println(st); 


			if(st.startsWith("@"))
			{
				String array[] = st.split("\\{") ;
				String tipo = array[0].substring(1) ;

				if (array.length < 2 ){
					erroresPorID++ ;
				}

				contarTipoBiblio(tipo);		
				
			}	
			
			biblio = biblio + st ;
			
			st = br.readLine();
		}

		imprimirCantidadesTipo();

		imprimirErrores();
		//System.out.println(biblio);
		
 		String bloques[]=biblio.split("@") ;
		
 		
 		for (int i = 1; i <= bloques.length; i++) 
 		{
 			String array[] = bloques[i].split("\\{") ;
			String tipo = array[0] ;
 			switch (tipo) 
 			{
 			case ARTICLE:
 				art.contarNumeroErroresRequeridos(bloques[i]);
 				art.numeroDeCorchetes(bloques[i]);
 				break;
 			case BOOK:
 				book.contarNumeroErroresRequeridos(bloques[i]);
 				book.numeroDeCorchetes(bloques[i]);
 				break;
 			case BOOKLET:
 				booklet.contarNumeroErroresRequeridos(bloques[i]);
 				booklet.numeroDeCorchetes(bloques[i]);
 				break ;
 			case CONFERENCE:
 				conference.contarNumeroErroresRequeridos(bloques[i]);
 				conference.numeroDeCorchetes(bloques[i]);
 				break ;
 			case INBOOK:
 				inbook.contarNumeroErroresRequeridos(bloques[i]);
 				inbook.numeroDeCorchetes(bloques[i]);
 				break ;
 			case INCOLLECTION:
 				incollection.contarNumeroErroresRequeridos(bloques[i]);
 				incollection.numeroDeCorchetes(bloques[i]);
 				break ;
 			case INPROCEEDINGS:
 				inproceedings.contarNumeroErroresRequeridos(bloques[i]);
 				inproceedings.numeroDeCorchetes(bloques[i]);
 				break ;
 			case MANUAL:
 				manual.contarNumeroErroresRequeridos(bloques[i]);
 				manual.numeroDeCorchetes(bloques[i]);
 				break ;
 			case MASTERSTHESIS:
 				masterthesis.contarNumeroErroresRequeridos(bloques[i]);
 				masterthesis.numeroDeCorchetes(bloques[i]);
 				break ;
 			case MISC:
 				misc.contarNumeroErroresRequeridos(bloques[i]);
 				misc.numeroDeCorchetes(bloques[i]);
 				break ;
 			case PHDTHESIS:
 				phd.contarNumeroErroresRequeridos(bloques[i]);
 				phd.numeroDeCorchetes(bloques[i]);
 				break ;
 			case PROCEEDINGS:
 				proceedings.contarNumeroErroresRequeridos(bloques[i]);
 				proceedings.numeroDeCorchetes(bloques[i]);
 				break ;
 			case TECHREPORT:
 				techrep.contarNumeroErroresRequeridos(bloques[i]);
 				techrep.numeroDeCorchetes(bloques[i]);
 				break ;
 			case UNPUBLISHED:
 				unpublished.contarNumeroErroresRequeridos(bloques[i]);
 				unpublished.numeroDeCorchetes(bloques[i]);
 				break ;

 			}
		}
		

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
