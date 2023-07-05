package aufgabe6;

public class Hauptprogramm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Konto k1 = new Konto("0000000001",1000);
		System.out.println(k1.getKontonummer()+"<-Kontonummer Kontostand->"+k1.getKontostand());
		k1.auszahlen(750.50);
		k1.einzahlen(500);
		System.out.println(k1.getKontonummer()+"<-Kontonummer Kontostand->"+k1.getKontostand());
		
		
		
		 Girokonto gk=new Girokonto("0000000001", 10000.0, 1000.0);
		 gk.auszahlen(11000.0);
		 System.out.println("Kontostand: " + gk.getKontostand());
		 gk.einzahlen(11000.0);
		 gk.auszahlen(11001.0);
		 System.out.println("Kontostand: "+gk.getKontostand());
		 
		 Bruch b1 = new Bruch(3,4);
		 Bruch b2 = new Bruch(1,2);
		 System.out.println(b1.dezimalwert());
		 Bruch b3 = b1.addiere(b2);
		 System.out.println(b3.dezimalwert());
		 BruchMitSeriennummer bNr1 = new BruchMitSeriennummer(1,5);
		 BruchMitSeriennummer bNr2 = new BruchMitSeriennummer(2,5);
		 BruchMitSeriennummer bNr3 = new BruchMitSeriennummer(3,5);
		 BruchMitSeriennummer bNr4 = new BruchMitSeriennummer(4,5);
		 BruchMitSeriennummer bNr5 = new BruchMitSeriennummer(5,5);
		 System.out.println(bNr1.dezimalwert()+" "+bNr1.getSeriennummer());
		 System.out.println(bNr2.dezimalwert()+" "+bNr2.getSeriennummer());
		 System.out.println(bNr3.dezimalwert()+" "+bNr3.getSeriennummer());
		 System.out.println(bNr4.dezimalwert()+" "+bNr4.getSeriennummer());
		 System.out.println(bNr5.dezimalwert()+" "+bNr5.getSeriennummer());
		 
		 int vermoegen = 200000;
		 var a1 = new Anteil(1,4);
		 var a2 = new Anteil(1,2);
		 System.out.println("Anteil a1: " + a1.bruchToString());
		 System.out.println("Betrag von a1 :" + vermoegen * a1.dezimalwert());
		 System.out.println("Anteil a2: " + a2.bruchToString());
		 System.out.println("Betrag von a2: " + vermoegen * a2.dezimalwert());
		 System.out.println("Verteilt: " + a1.verteilt.bruchToString());
		 System.out.println("Rest: " + a1.getRest().bruchToString());
		 System.out.println("Restbetrag: " + vermoegen * a1.getRest().dezimalwert());
		 
		 
	}

}
