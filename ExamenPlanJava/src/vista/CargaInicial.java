package vista;

import modelo.Circulo;
import modelo.Rectangulo;
import modelo.Rombo;
import negocio.INegocio;

public class CargaInicial {

	private INegocio negocio;

	public CargaInicial(INegocio negocio) {
		this.negocio = negocio;
		init();
	}

	private void init() {
		negocio.nuevaFigura(new Circulo(1, 2, 5));
		negocio.nuevaFigura(new Rectangulo(1, 1, 7, 9));
		negocio.nuevaFigura(new Circulo(-1, 4, 7.5));
		negocio.nuevaFigura(new Circulo(10, 22, 5.2));
		negocio.nuevaFigura(new Rombo(0.5, 10, 12, 7.5));
		negocio.nuevaFigura(new Rectangulo(-7, 1.5, 17, 9));
		negocio.nuevaFigura(new Rectangulo(4, 4, 8.5, 3));
		negocio.nuevaFigura(new Rectangulo(2, -16, 10, 21));
		negocio.nuevaFigura(new Circulo(2, 0, 7.9));
		negocio.nuevaFigura(new Rombo(12, -7, 4, 1.5));
		negocio.nuevaFigura(new Circulo(0, 0, 5));
		negocio.nuevaFigura(new Rectangulo(0, -1, 16, 9));
		negocio.nuevaFigura(new Circulo(10, 0, 0.5));
		negocio.nuevaFigura(new Rombo(0, 0, 12, 9));
	}
}
