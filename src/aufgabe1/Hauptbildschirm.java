package aufgabe1;
import javax.swing.JOptionPane;


public class Hauptbildschirm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Kreis Test = new Kreis(Double.parseDouble(JOptionPane.showInputDialog("Radius")));
		JOptionPane.showMessageDialog(null,Test.getFlaeche());
		Rechteck TestR = new Rechteck(Double.parseDouble(JOptionPane.showInputDialog("Breite")),Double.parseDouble(JOptionPane.showInputDialog("Laenge")));
		JOptionPane.showMessageDialog(null,TestR.getDiagonale());
		TestR.laengeAusgeben();
		
	}

}
