package vista;

import modelo.Punto;
import negocio.INegocio;

public class MuestraCentroMasa {

	private INegocio negocio;

	public MuestraCentroMasa(INegocio negocio) {
		this.negocio = negocio;
		init();
	}
	
	private void init(){
		Punto p = negocio.calculaCentroMasa();
		
		System.out.println();
		System.out.println("Centro de Masa: " + p);
	}
	
	
}
