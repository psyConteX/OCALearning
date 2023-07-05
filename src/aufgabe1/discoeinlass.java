package aufgabe1;

import javax.swing.JOptionPane;

public class discoeinlass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//altercheck integer
		//gendercheck bool?
		//vipcheck sondernachricht angebot
		//Altersabfrage
		if (Integer.parseInt(JOptionPane.showInputDialog("Bitte geben Sie ihr Alter an"))<18) { 
			JOptionPane.showMessageDialog(null,"Sie sind nicht Alt genug");
		} else {
			
		boolean vip=false;	//false=false
		boolean gender=false; //false = male, true = female
		
		//abfrage Geschlecht
		String[] options = { "Mann", "Frau" };
		int selection = JOptionPane.showOptionDialog(null, "Bitte geben Sie ihr Geschlecht an", null, 0, 3, null, options, options[0]);
				if (selection == 0) {
					gender = false;
				}
				else if (selection == 1) { 
					gender = true;
				}
				
		//abfrage VIP status		
		options[0] =  "Normal";
		options[1] = 	"VIP" ;
		selection = JOptionPane.showOptionDialog(null, "Wie ist ihr Status", null, 0, 3, null, options, options[0]);
				if (selection == 0) {
					vip = false;
				}
				else if (selection == 1) { 
					vip = true;
				}
				
		String vipMessage="";
		String genderMessage="";
		
		if (vip) { vipMessage = "\nEs gibt ein Spezial VIP angebot für sie"; } 
		if (gender) { genderMessage = "\nLadies-Night! Es gibt 15% auf alle Getränke"; }
		
		JOptionPane.showMessageDialog(null,"Willkommen"+genderMessage+" "+vipMessage);
		}
	}

}
