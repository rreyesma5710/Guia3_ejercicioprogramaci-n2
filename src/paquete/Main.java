package paquete;
import paquete.Ascensor;
import paquete.Ascensor;
import java.util.Scanner;

public class Main {
	
	private static Scanner in  = new Scanner (System.in);

	public static void main(String[] args) {
		
		Ascensor ObjA = null;
		int opcion = 0;

		while(ObjA == null && opcion !=1){
			System.out.println("Antes crea el objeto Ascensor");
			opcion = mostrarMenu(); 
			if(opcion == 7)
				System.exit(0);
		}
		
		do{
			if(ObjA != null)
				opcion = mostrarMenu();
	     switch (opcion) {
	         case 1:  
	        	 ObjA = crearAscensor();
	        	 break;
	         case 2:  
	        	 System.out.println("EL numero es: " + ObjA.noPisosAtendidos());
	        	 break;
	         case 3:  
	        	 System.out.println("EL piso actual es: " + ObjA.getPisoActual());
	        	 break;
	         case 4:  
	        	 ObjA.sube();
	        	 break;
	         case 5:  
	        	 ObjA.baja();
	        	 break;
	         case 6:  
	        	 System.out.println(ObjA.toString());
	        	 break;	        	 
	         case 7:  
	        	 System.out.println("Saliendo...");
	        	 break;	        	 
	         default:
	        	 System.out.println("Digita un numero valido");
	        	 break;
	     }
		}while(opcion != 7);
	}
	
	public static Ascensor crearAscensor()
	{
		int pisos, sotanos, pisoActual;
		
		System.out.println("Digita numero de pisos");
		pisos = in.nextInt();
		System.out.println("Digita numero de sotanos");
		sotanos = in.nextInt();
		do{
			System.out.println("Digita piso inicial");
			pisoActual = in.nextInt();
		}while(pisoActual > pisos || pisos<(sotanos*-1) || pisoActual == 0);
		Ascensor ObjA = new Ascensor(pisos, sotanos, pisoActual);
		System.out.println("¡Ascensor CREADO!");
		
		return ObjA;
	}
	
	public static int mostrarMenu()
	{
		int opcion;

		System.out.println("1) Crea Ascensor");
		System.out.println("2) Numero de pisos atendidos");
		System.out.println("3) Piso actual");
		System.out.println("4) Subir");
		System.out.println("5) Bajar");
		System.out.println("6) Mostrar Ascensor");
		System.out.println("7) Salir");
		opcion = in.nextInt();
		
		return opcion;
	}
	
	
}


