package persistencia;

import modelo.Figura;

public interface IFiguraDao {

	public void insertarFigura(Figura f); // Inserta una nueva figura en el sistema de persistencia

	public int cantRectangulos(); // Retorna la cantidad de rectangulos almacenados

	public Figura[] buscarFiguras(); // Retorna todas las figuras almacenadas
	
	public int cantFiguras(); // Retorna la cantidad de figuras almacenadas
}
