package aufgabe7;

import javax.swing.JOptionPane;

public class Hauptprogramm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String i;
		//i=JOptionPane.showInputDialog("Hur Durr, auch aufn Montag zaehl ich für dich");
		/*
		long time = System.currentTimeMillis();
		StringBuilder newI = new Reversestring(i).getRev();
		long time2 = System.currentTimeMillis();
		System.out.println(newI);

		System.out.println(new Vokalzaehler(i).tIo());

		
		System.out.println(time);
		System.out.println(time2);
		System.out.println(time2-time);
		int arraysize = Integer.parseInt(JOptionPane.showInputDialog("Anzahl der Strings"));
		
		String[] test = new String[arraysize];
		for (int i=0; i<arraysize;i++) {
			test[i] = JOptionPane.showInputDialog("Anzahl der Strings");
		}
		Stringsort testobj = new Stringsort(arraysize ,test);
		testobj.sortArrays();
		for (String i : testobj.stringArray) {
			System.out.println(i);
		} 
		Vokalloescher testvl = new Vokalloescher(i);
		i=testvl.delVok();
		System.out.println(i);
		*/
		Zahlensystem testint = new Zahlensystem( Integer.parseInt(JOptionPane.showInputDialog("Geben Sie eine Zahl für die ausgabe als Dez,Bin,Hex,Octal an")) );
		
		System.out.println(testint.getDez());
		System.out.println(testint.getBin());
		System.out.println(testint.getHex());
		System.out.println(testint.getOct());
		
		//JOptionPane.showMessageDialog(null,Long.decode
		//		("0x"+JOptionPane.showInputDialog("Bitte geben Sie einen Hexwert an")));
		String test = JOptionPane.showInputDialog("Bitte geben Sie einen Hexwert an");
		Hexumrechner.getLong(test);
		
	}
}
