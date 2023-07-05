package aufgabe6;

public class Bruch {

	private int zaehler;
	 private int nenner;
	 Bruch() {
	 zaehler = 0;
	 nenner = 1;
	 }
	 Bruch(int x) {
	 zaehler = x;
	 nenner = 1;
	 }
	 Bruch(int x, int y) {
	 zaehler = x;
	 nenner = y;
	 }
	 int getZaehler() {
	 return zaehler;
	 }
	 int getNenner() {
	 return nenner;
	 }
	 void setZaehler(int z) {
	 zaehler = z;
	 }
	 void setNenner(int n) {
	 nenner = n;
	 }
	 void ausgeben() {
	 System.out.print(zaehler + "/" + nenner);
	 }
	 String ausgeben(String str) {
	 return zaehler + "/" + nenner;
	 }
	 String bruchToString() {
		 Bruch test = this;
		 test.kuerzen();
	 return test.getZaehler() + "/" + test.getNenner();
	 }
	 void kuerzen() {
	 var m = Math.abs(zaehler); // speichert in m den Betrag von zaehler
	 var n = Math.abs(nenner); // speichert in n den Betrag von nenner
	 var r = m % n;
	 while (r > 0) { // Berechnung des ggT
	 m = n;
	 n = r;
	 r = m % n;
	 }
	 zaehler /= n; // in n steht jetzt der ggT
	 nenner /= n;
	 }
	 void gekuerztausgeben() {
	 kuerzen();
	 ausgeben();
	 }
	 String gekuerztausgeben(String str) {
	 kuerzen();
	 return ausgeben(str);
	 }
	 boolean equals(Bruch x) {
	 var a = new Bruch(this.zaehler, this.nenner);
	 var b = new Bruch(x.zaehler, x.nenner);
	 a.kuerzen();
	 b.kuerzen();
	 if ((a.zaehler == b.zaehler) && (a.nenner == b.nenner)) {
	 return true;
	 } else {
	 return false;
	 }
	 }
	 Bruch addiere(Bruch b) {
		 return new Bruch((b.getZaehler()*this.getNenner()+b.getNenner()*this.getZaehler()),(b.getNenner()*this.getNenner()));
	 }
	 Bruch substrahiere(Bruch b) {
		 return new Bruch((b.getNenner()*this.getZaehler()-b.getZaehler()*this.getNenner()),(b.getNenner()*this.getNenner()));
	 }
	 double dezimalwert() {
		 double a,b;
		 a=this.getZaehler();
		 b=this.getNenner();
		 return a/b;
	 }
	
}
