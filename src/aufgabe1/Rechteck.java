package aufgabe1;

public class Rechteck {
double laenge;
double breite;
	public Rechteck() {
		this.laenge=0;
		this.breite=0;
	}
	public Rechteck(double a, double b) {
		this.laenge=a;
		this.breite=b;
	}

	void setLaenge(double l) {
		this.laenge=l;
	}
	void setBreite(double b) {
		this.breite=b;
	}
	void setSeiten(double l, double b) {
		this.laenge=l;
		this.breite=b;
	}
	double getLaenge() {
		return this.laenge;
	}
	double getBreite() {
		return this.breite;
	}
	double getLangeSeite() {
		if (this.breite>this.laenge) return this.breite;
		else 						 return this.laenge;
	}
	double getKurzeSeite() {
		if (this.breite<this.laenge) return this.breite;
		else 						 return this.laenge;
	}
	double getDiagonale() {
		return Math.sqrt(Math.pow(this.laenge, 2)+Math.pow(this.breite, 2));
	}
	double getFlaeche() {
		return this.breite*this.laenge;
	}
	double getUmfang() {
		return this.breite*2+this.laenge*2;
	}
	void laengeAusgeben() {
		double laenge = 5.4;
		System.out.println("Länge: " + laenge);
	}
	void laengeVergroessern(double l) 	{ this.laenge+=l; }
	void breiteVergroessern(double b) 	{ this.breite+=b; }
	void laengeVerkleinern(double l)	{ this.breite-=l; }
	void breiteVerkleinern(double b)	{ this.breite-=b; }



}
