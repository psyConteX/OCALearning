package aufgabe7;

public class Reversestring {
	String input;
	Reversestring(String eInput) {
		input=eInput;
	}

	StringBuilder getRev(){
		StringBuilder tmp = new StringBuilder(input);
		StringBuilder tmp2 = new StringBuilder();
		for (int i=tmp.length()-1;i>=0;i--) {
		tmp2.append(tmp.charAt(i));
		}
		return tmp2;
 }
}
