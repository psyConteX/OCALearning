package aufgabe6;

public class Konto {
	private String kontonummer;
	private double kontostand;

	public Konto(String knum,double startguthaben) {
		this.kontonummer = knum;
		this.kontostand = startguthaben;
	}
	
	public Konto() {
	}
	
	double getKontostand() {
		return this.kontostand;
	}
	String getKontonummer() {
		return this.kontonummer;
	}
	void einzahlen(double amount) {
		this.kontostand+=amount;
	}
	void auszahlen(double amount) {
		this.kontostand-=amount;
	}
	
}
