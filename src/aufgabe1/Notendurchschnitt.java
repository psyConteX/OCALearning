package aufgabe1;

import javax.swing.JOptionPane;

public class Notendurchschnitt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//eingabe anzahl an noten
		// array für menge and noten
		//eingabe einzelner noten durch user
		//ausgabe von allen noten kein komma am ende
		double noten[];
		int arraysize =	Integer.parseInt(JOptionPane.showInputDialog(null,"Bitte geben Sie die exakten Anzahl von Noten an,"
												+ " deren Notendurchschnitt Sie berechnen wollen"));
		String ausgabe="";
		noten = new double[arraysize];
		double summeNoten=0;
		
		for (int i=0;i<arraysize;i++) { 
			
			noten[i] = Double.parseDouble(JOptionPane.showInputDialog(null,
					"Bitte geben Sie Ihre "+(i+1)+". Note ein:"));
		
			summeNoten += noten[i];
		
				if (i==arraysize-1) {
					ausgabe += " "+noten[i];
				} 
				else { 
					ausgabe += " "+noten[i]+",";
				}
		}

		JOptionPane.showMessageDialog(null,"Ihre eingegebene Noten betragen:"+ausgabe+"\nIhr Notendurchschnitt beträgt: "+String.format("%.2f", summeNoten/arraysize));
	}

}
