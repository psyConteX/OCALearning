package aufgabe1;

import javax.swing.JOptionPane;

public class namen_ausgeben {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ausgabe name der person
		//anzahl der wiederholung >= 0 && anzahl <= 30
		//optionpane ausgabe, ausgabe wie bild
		//falls grenzüberschreitung error
		//struktogramm/pap
		//keine magicnumber
		
		//do while, for varianten
		
		String bufferstring = JOptionPane.showInputDialog("Anzahl der wiederholung");
		
		int anzahl = Integer.parseInt(bufferstring);
		
		if (anzahl<0||anzahl>30) { 
			JOptionPane.showMessageDialog(null, "Fehler Anzahl wiederholung zu groß oder zu niedrig"); 
			} 
		else {
			bufferstring = JOptionPane.showInputDialog("Bitte Namen angeben");
			int i=1;
			String ausgabe = "";
			
				while (i<=anzahl) {
					ausgabe += i+": "+bufferstring+"\n";
					i++;
				}
//			for (i = 1; i<= anzahl;i++) {	eingabename += i+": "+bufferstring+"\n";	 }
// 			do { eingabename += i+": "+bufferstring+"\n"; i++; } while (i<=anzahl);
				JOptionPane.showMessageDialog(null, ausgabe);
			}
		do {
			anzahl=0;
			anzahl=Integer.parseInt(JOptionPane.showInputDialog("Bitte geben Sie eine Zahl über 0 und unter 31 ein")); 
			} 
		while (anzahl<=0&&anzahl>30);
		bufferstring = JOptionPane.showInputDialog("Bitte Namen angeben");
		String eingabename = "";
		for (int i = 1; i<= anzahl;i++) {	eingabename += i+": "+bufferstring+"\n";	 }
	}

}
