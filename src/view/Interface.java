package view;

import java.util.Scanner;

import mundo.Principal;


public class Interface {


	private static Principal principal ;


	public static void main(String[] args) 
	{
		principal = new Principal() ;

		Scanner sc = new Scanner(System.in);
		boolean fin=false;
		while(!fin)
		{
			//imprime menu
			printMenu();

			//opcion req
			int option = sc.nextInt();

			switch(option)
			{

			case 1: // cargar informacion a procesar

				try{
					principal.cargarArchivo();

				}
				catch (Exception e) {
					// TODO: handle exception
				}

				break ;



			case 2: 
				fin=true;
				sc.close();
				break;

			}
		}
	}
	/**
	 * Menu 
	 */
	private static void printMenu() //
	{
		System.out.println("---------LENGUAJES Y MAQUINAS----------");
		System.out.println("---------------------Proyecto 0----------------------");
		System.out.println("Iniciar la Fuente de Datos a Consultar :");
		System.out.println("1. Cargar toda la informacion del sistema de una fuente de datos.");
		System.out.println("2. Salir");
		System.out.println("Ingrese el numero de la opcion seleccionada y presione <Enter> para confirmar: (e.g., 1):");

	}



}
