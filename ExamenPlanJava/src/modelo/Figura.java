package modelo;

public abstract class Figura {
	private double x;
	private double y;

	public Figura() {
		x = 0;
		y = 0;
	}

	public Figura(double x, double y) {
		this.x = x;
		this.y = y;
	}

	double distancia(Figura otro) {
		double dx, dy;
		dx = x - otro.x;
		dy = y - otro.y;
		return Math.sqrt(dx * dx + dy * dy);
	}

	public abstract double area();

	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Figura otra = (Figura) obj;
		return x == otra.x && y == otra.y;
	}

	public static Punto centroMasas(Figura[] figs) {
		double sumArea = 0, sumXArea = 0, sumYArea = 0;
		for (int i = 0; i < figs.length; i++) {
			sumXArea += figs[i].x * figs[i].area();
			sumYArea += figs[i].y * figs[i].area();
			sumArea += figs[i].area();
		}
		return new Punto(sumXArea / sumArea, sumYArea / sumArea);
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}
}
