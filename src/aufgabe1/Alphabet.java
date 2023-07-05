package aufgabe1;

import javax.swing.JOptionPane;

public class Alphabet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String alphabet="";
		for (int i=65;i<91;i++) alphabet += (char)i+"\n";
		JOptionPane.showMessageDialog(null,alphabet);
		

	}

}
