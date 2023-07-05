package aufgabe1;

import javax.swing.JOptionPane;

public class faculty {
	
	public static String fac(int wert) {
		
		if (wert==0) wert=1;	//faculty check bei 0 ist 1
		int i = 0;				//iterator init für while loop
		int newWert = wert;		//
		String ausgabe = "";
		
		while (1<wert&&i<10) {
			ausgabe += "\n"+"newwert="+newWert+" wert="+--wert;
			newWert *= wert;
			i++;

		}
		
		return ausgabe;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		JOptionPane.showMessageDialog(null,fac(Integer.parseInt(JOptionPane.showInputDialog("Faculty Integer"))));
		
	}

}
