package aufgabe7;

public class Vokalzaehler {
	StringBuilder input;
	int counter=0;

	Vokalzaehler(String externInput) {
		input = new StringBuilder(externInput);
	}
	public void zaehlen() {
		for (int i=0;i<input.length();i++) {
			switch (input.charAt(i)) {
			case 'a'|'A': counter++; break;
			case 'e'|'E': counter++; break;
			case 'i'|'I': counter++; break;
			case 'o'|'O': counter++; break;
			case 'u'|'U': counter++; break;
			}
		}	
	}
	int getCounter() {
		return counter;	
	}
	int tIo() {
		zaehlen();
		return getCounter();
		//return counter;
	}
}