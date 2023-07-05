package aufgabe1;

public class Kreis {
	double radius;
	
	public Kreis() {
		this.radius=0;
	}
	public Kreis(double i) {
		this.radius=i;
	}
	public Kreis(String i) {
		this.radius=Double.parseDouble(i);
	}
	

	double getRadius() {
	return this.radius;
	}
	void setRadius(double r) {
		this.radius=r;
	}
	double getUmfang() {
		return 2*Math.PI*this.radius;
	}
	double getFlaeche() {
		return (Math.pow(this.radius, 2)*Math.PI);
	}
	void setUmfang(double u) 	{ this.radius = u/Math.PI/2; }
	void setFlaeche(double f)	{ this.radius = Math.sqrt(f)/Math.PI; }
}
