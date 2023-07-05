package aufgabe6;

public class BruchMitSeriennummer extends Bruch {
	static int seriennummer=0;
	final int nr;
	
	
	{
		seriennummer++;
		this.nr=seriennummer;
	}
	 
	 
	 BruchMitSeriennummer() {
	 super();
	 }
	 BruchMitSeriennummer(int x) {
	 super(x);
	 }
	 BruchMitSeriennummer(int x, int y) {
	 super(x,y);
	 }
	 
	
	int getSeriennummer() {
		return this.nr;
	}

}
