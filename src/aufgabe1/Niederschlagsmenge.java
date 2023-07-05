package aufgabe1;
import javax.swing.JOptionPane;

public class Niederschlagsmenge {
static byte MONATSANZAHL = 12;
static byte QUARTAL = 3;
//static String NSTXT = "Die niederschlagsmenge für ";

static String NSTXT(String monat) { 
	String NSTXT="Die niederschlagmenge für "+monat+" ist: ";
	return NSTXT;
} 

	public static void main(String[] args) {
		// TODO Korrekten Monate Anpassen

		double nsMaerz,nsApril,nsMai;
		
		String bufferstring = JOptionPane.showInputDialog("Literanzahl März");
		nsMaerz = Double.parseDouble(bufferstring);
		
		bufferstring = JOptionPane.showInputDialog("Literanzahl April");
		nsApril = Double.parseDouble(bufferstring);
		
		bufferstring = JOptionPane.showInputDialog("Literanzahl Mai");
		nsMai = Double.parseDouble(bufferstring);
		
		JOptionPane.showMessageDialog(null,
				NSTXT("März")+nsMaerz+" l/qm\n"+
				NSTXT("April")+nsApril+" l/qm\n"+
				NSTXT("Mai")+nsMai+" l/qm\n\n"+
				"Die durchschnittliche Niederschlagsmenge beträgt: "+((nsMaerz+nsApril+nsMai)/QUARTAL)+" l/qm");
		
	}
}


