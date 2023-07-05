package aufgabe1;

import javax.swing.JOptionPane;

public class Arrayincrease {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] arr = {"Hans", "Christian", "Lisa"};
		//eingabe elemente zu arr
		final int USR_AMOUNT =  Integer.parseInt(JOptionPane.showInputDialog(null, "Please enter the amount by which the array should be increased"));
		String[] tmpArr = new String[USR_AMOUNT+arr.length];
		for (int i=0;i<arr.length;i++) {
			tmpArr[i] = arr[i];
		}
		arr = tmpArr;
		String ausgabe="";
		int j=0;
		for (String i : arr) {
			j++;
			if (j==arr.length) {
					ausgabe += " "+i;
				} 
				else { 
					ausgabe += " "+i+",";
				}
			}
		JOptionPane.showMessageDialog(null, ausgabe);
		}
		
	}

