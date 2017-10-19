package vista;

import modelo.Figura;
import negocio.INegocio;

public class MuestraFiguras {

	private INegocio negocio;

	public MuestraFiguras(INegocio negocio) {
		this.negocio = negocio;
		init();
	}
	
	private void init(){
		System.out.println();
		System.out.println("LISTADO DE FIGURAS");
		System.out.println("------------------");
		Figura[] figs = negocio.consultarTodas();
		for (int i = 0; i < figs.length; i++) {
			System.out.println(figs[i]);
		}
	}
	

}
