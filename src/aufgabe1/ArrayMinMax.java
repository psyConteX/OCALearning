package aufgabe1;

import javax.swing.JOptionPane;

public class ArrayMinMax {
	
final static int MAXINT=2147483647;
final static int MININT=-2147483648;

	public static void main(String[] args) {
		
		// TODO: die, adding le funny comment
		
		int arr1[] = {5,2,10,12,3,-1,-24242424};
		
		int max=MININT;
		int min=MAXINT;
		
		String ausgabearray="";
		
		for (int i : arr1) {
			ausgabearray   += 	i+", ";
			if (i>max) max 	= 	i;
			if (i<min) min 	= 	i;
		}
		
		JOptionPane.showMessageDialog(null,	"Der Such-Array betraegt: "		+ausgabearray+
											"\n\nDer Max-Wert betraegt: "	+max+
											"\nDer Min-Wert betraegt: "		+min);
	}

}
