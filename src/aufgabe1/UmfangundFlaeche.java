package aufgabe1;
import javax.swing.JOptionPane;

public class UmfangundFlaeche {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	    String[] options = { "mm", "cm", "m" };
	    String einheit;
	    
		var selection = JOptionPane.showOptionDialog(null, null, "Einheit", 0, 3, null, options, options[0]);
		if (selection == 0) {
			einheit = "mm";
		}
		else if (selection == 1) { 
			einheit = "cm";
		}
		else if (selection == 2) { 
			einheit = "m";
		} else { einheit = "Error!"; }
		
		String bufferstring = JOptionPane.showInputDialog("Länge");
		double laenge = Double.parseDouble(bufferstring);
		
		bufferstring = JOptionPane.showInputDialog("Breite");
		double breite = Double.parseDouble(bufferstring);
		
		double umfang = 2*laenge+2*breite;
		double flaeche = laenge*breite;
		
		JOptionPane.showMessageDialog(null,
				
				"Die eingegeben Laenge betraegt: "+laenge+einheit+
				"\nDie eingegebene Breite betraegt: "+breite+einheit+
				"\n\n"+
				"Der Umfang betraegt: "+umfang+einheit+
				"\nDie Flaeche betraegt: "+flaeche+einheit+"²");
		
	}

}
