package vista;

import java.util.Scanner;

import negocio.INegocio;
import negocio.Negocio;

public class MenuPrincipal {
	private Scanner tec;
	private INegocio negocio;
	
	public MenuPrincipal() {
		tec = new Scanner(System.in);
		negocio = new Negocio();
		init();
	}
	
	private void init(){
		int opcion;
		
		do{
			System.out.println("\n=================");
			System.out.println("MENU PRINCIPAL");
			System.out.println("--------------");
			System.out.println("1 - Carga Inicial Figuras");
			System.out.println("2 - Mostrar Estadisticas Rectangulos");
			System.out.println("3 - Mostrar todas las figuras");
			System.out.println("4 - Centro de Masas");
			System.out.println("9 - Salir");
			
			System.out.print("Opcion: ");
			opcion = tec.nextInt();
			
			switch (opcion) {
			case 1:
				new CargaInicial(negocio);
				break;
			case 2:
				System.out.print("\nEl porcentaje de Rectangulos cargados es: ");
				System.out.println(negocio.porcRectangulos() + " %");
				break;
			case 3:
				new MuestraFiguras(negocio);
				break;
			case 4:
				new MuestraCentroMasa(negocio);
				break;
			}
		}while(opcion!=9);
	}
	
}
