package aufgabe1;

import javax.swing.JOptionPane;

public class Array2DPerson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[][] persons = {
				{"Hans", "Werner", "48", "ledig", "Handwerker"},
				{"Christian", "Herrero", "30", "verheiratet", "Bankkaufmann"},
				{"Elif", "Yamaz", "8", "ledig", "Schülerin"},
				{null, null, null, null, null}
				};
		
		String[] categories = {
		"Vorname", "Nachname", "Alter", "Familienstand", "Beruf"
		};
		String ausgabe="";
			for (int i=0;i<persons.length;i++) {
				
				for (int j = 0;j<categories.length;j++) {
					
					if (persons[i][j]==null) {
						//eingabe GUI auf [3] 0-3
						persons[i][j] = JOptionPane.showInputDialog(categories[j]+":");
						
					}
					ausgabe += persons[i][j]+" ";
				}
				ausgabe += "\n";
			}
			JOptionPane.showMessageDialog(null, ausgabe);
		}


}
