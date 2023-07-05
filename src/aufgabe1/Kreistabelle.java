package aufgabe1;

import javax.swing.JOptionPane;

public class Kreistabelle {
	//use kreis
	//tabelle 30 zeilen
	//increase factor
	
	//get user input
	double radius;
	double factor;
	
	public Kreistabelle() {
		this.radius=0;
		this.factor=0;
	}
	public Kreistabelle(double r, double f) {
	 this.radius=r;
	 this.factor=f;
	}
	void setRadius() {
	this.radius = Double.parseDouble(JOptionPane.showInputDialog("Radius"));
	}
	void setFactor() {
	this.factor = Double.parseDouble(JOptionPane.showInputDialog("Faktor"));	
	}
}
