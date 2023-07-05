package aufgabe1;

import javax.swing.JOptionPane;

public class Zahlenraten {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//while (!nichtrichtig&&fehlversuch<5&&!abbgebrochen) weiter
		
		int versuche=0;
		boolean istFertig=false;
		boolean abbruch=false;
		int zahl=1;
		
		while (!istFertig&&!abbruch) {
		
			String bufferstring = JOptionPane.showInputDialog("Raten Sie die Zahl");
			zahl = Integer.parseInt(bufferstring);
			versuche++;
			
			if (zahl>30||zahl<1) zahl=1; //schlechte art zu überprüfen aber es ist meine
			
			if (zahl%5==0) { //sieg bei zahl zwischen 0 und 30 und durch 5 teilbar
				istFertig=true; 		
				JOptionPane.showMessageDialog(null,"Gewonnen!");
				System.exit(0);
			}
			else JOptionPane.showMessageDialog(null,"Falsch!");
			
			if (versuche==5) {
				JOptionPane.showMessageDialog(null,"Die Zahl muss zwichen 1 und 30 liegen");
			}
			
			if (versuche>=10) { 
				
				bufferstring = JOptionPane.showInputDialog("Möchten Sie das Spiel beenden?");
				bufferstring.toLowerCase();
				
				if (bufferstring.equals("ja")) abbruch=true; 
			}
			
			if (versuche==30) abbruch=true;
			
			if(abbruch) JOptionPane.showMessageDialog(null,"Programm wird abgebrochen!"); 
		
		}
	}

}
