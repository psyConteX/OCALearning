package aufgabe6;

public class Anteil extends Bruch {
	static Bruch verteilt = new Bruch();
	{
		if (verteilt.addiere(this).dezimalwert()<=1)  verteilt = verteilt.addiere(this);
		else System.out.println("Error");
	}
	
	Anteil() 					{	super();		}
	Anteil(int x, int y)		{	super(x, y);	}
	
	static double getVerteilt() {	return verteilt.dezimalwert();	}
	
	Bruch getRest() {	return new Bruch(1,1).substrahiere(verteilt);	}
	
}