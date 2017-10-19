package modelo;

public class Circulo extends Figura {
	private double r;

	public Circulo(double x, double y, double r) {
		super(x, y);
		this.r = r;
	}
	
	public double area() {
		return Math.PI * r * r;
	}

	public boolean equals(Object obj) {
		if (!super.equals(obj)) return false;
		Circulo otro = (Circulo)obj;
		return r == otro.r;
	}

	public String toString() {
		return "Circulo[(" + getX() + ", " + getY() + "), " + r + "]";
	}

	public double getR() {
		return r;
	}

	public void setR(double r) {
		this.r = r;
	}
}
