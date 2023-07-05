package aufgabe6;

public class Girokonto extends Konto {
	double limit;
	
	public Girokonto(String knum, double startguthaben, double lim) {
		super(knum, startguthaben);
		this.limit = -lim;
	}
	double getLimit() {
		return this.limit;
	}
	void setLimit(double value) {
		this.limit = -value;
	}
	
	
	void auszahlen(double amount) {
		
		if (this.getKontostand()-amount>=this.limit) super.auszahlen(amount);
		else System.out.println("Fehler: Kreditlimit überschritten!");
		
	}
	
}
