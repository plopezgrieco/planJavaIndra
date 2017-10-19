package modelo;


public class Rectangulo extends Figura {
	private double l1;
	private double l2;

	public Rectangulo(double x, double y, double l1, double l2) {
		super(x, y);
		this.l1 = l1;
		this.l2 = l2;
	}

	public double area() {
		return l1 * l2;
	}
	
	public String toString() {
		return "Rectangulo [(" + getX() + ", " + getY() + "), " + l1 + ", " + l2 + "]";
	}

	public boolean equals(Object obj) {
		if (!super.equals(obj))	return false;
		Rectangulo otro = (Rectangulo)obj;
		return (this.l1 == otro.l1 && this.l2 == otro.l2) || 
				(this.l1 == otro.l2 && this.l2 == otro.l1);
	}

	public double getL1() {
		return l1;
	}

	public void setL1(double l1) {
		this.l1 = l1;
	}

	public double getL2() {
		return l2;
	}

	public void setL2(double l2) {
		this.l2 = l2;
	}

}
