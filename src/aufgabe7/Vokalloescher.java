package aufgabe7;

public class Vokalloescher {
	StringBuilder string;
	char[] vokalarray= {'a','A','e','E','i','I','o','O','u','U'};
	Vokalloescher(String hurdur) {
		string = new StringBuilder(hurdur);
	}
	
	String delVok() {
		
		for (int i=0;i<string.length();i++) {
			for (char c : vokalarray) {
				if (string.charAt(i)==c) {
				string.deleteCharAt(i);
				i=0;
				break;
				}
			}

		}
		return string.toString();	
	}
}
