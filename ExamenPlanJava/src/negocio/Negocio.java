package negocio;

import modelo.Figura;
import modelo.Punto;
import persistencia.FiguraDao;
import persistencia.IFiguraDao;

public class Negocio implements INegocio {
	
	IFiguraDao dao;
	
	public Negocio(){
		dao = new FiguraDao();
	}

	public void nuevaFigura(Figura f) {
		dao.insertarFigura(f);
	}

	public double porcRectangulos() {
		if (dao.cantFiguras() > 0) {
			return (double)dao.cantRectangulos() / dao.cantFiguras() * 100;
		}
		return 0;
	}

	public Figura[] consultarTodas() {
		return dao.buscarFiguras();
	}

	public Punto calculaCentroMasa() {
		return Figura.centroMasas(dao.buscarFiguras());
	}
}
