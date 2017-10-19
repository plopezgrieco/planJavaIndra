package negocio;

import modelo.Figura;
import modelo.Punto;

public interface INegocio {

	public void nuevaFigura(Figura f); // Almacenar una nueva figura
	
	public double porcRectangulos(); // Retorna el porcentaje de rectangulos sobre el total de figuras
	
	public Figura[] consultarTodas(); // Retorna todas las figuras almacenadas en el Dao
	
	public Punto calculaCentroMasa(); // Retorna el Centro de Masa de Todas las figuras cargadas
}
