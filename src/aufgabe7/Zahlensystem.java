package aufgabe7;

public class Zahlensystem {
	int number;
	Zahlensystem(int input) {
		number = input;
	}
	int getDez() {
		return number;
	}
	String getBin() {
		return Integer.toBinaryString(number);
	}
	String getHex() {
		return Integer.toHexString(number).toUpperCase();
	}
	String getOct() {
		return Integer.toOctalString(number);
	}
	
}
