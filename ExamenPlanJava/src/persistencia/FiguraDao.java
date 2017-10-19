package persistencia;

import modelo.Figura;
import modelo.Rectangulo;

public class FiguraDao implements IFiguraDao{

	private Figura[] figuras;
	private int ultimo;
	
	public FiguraDao(){
		figuras = new Figura[100];
		ultimo = -1;
	}

	public void insertarFigura(Figura f) {
		ultimo ++;
		figuras[ultimo] = f;
	}

	public Figura[] buscarFiguras() {
		Figura[] cargadas = new Figura[ultimo+1];
		for (int i = 0; i < cargadas.length; i++) {
			cargadas[i] = figuras[i];
		}
		return cargadas;
	}

	public int cantRectangulos() {
		int cont = 0;
		for (int i = 0; i < figuras.length; i++) {
			if (figuras[i] instanceof Rectangulo) {
				cont++;
			}
		}
		return cont;
	}

	public int cantFiguras() {
		return ultimo + 1;
	}

}
