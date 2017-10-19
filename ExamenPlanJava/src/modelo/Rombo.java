package modelo;

public class Rombo extends Figura {
	private double d1, d2;

	public Rombo(double x, double y, double d1, double d2) {
		super(x, y);
		this.d1 = d1;
		this.d2 = d2;
	}

	public double area() {
		return (d1 * d2) / 2;
	}

	public boolean equals(Object obj) {
		if (!super.equals(obj)) return false;
		Rombo otro = (Rombo) obj;
		return d1 == otro.getD1() && d2 == otro.getD2();
	}
	
	public String toString() {
		return "Rombo [(" + getX() + ", " + getY() + "), " + d1 + ", " + d2 + "]";
	}

	double getD1() {
		return d1;
	}

	void setD1(double d1) {
		this.d1 = d1;
	}

	double getD2() {
		return d2;
	}

	void setD2(double d2) {
		this.d2 = d2;
	}
}
