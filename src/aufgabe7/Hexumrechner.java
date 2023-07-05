package aufgabe7;

public class Hexumrechner {
	static long returnlong;
	static char[] hex= { 'a','b','c','d','e','f' };
	

	public static long getLong(String s) {
		
		StringBuilder string = new StringBuilder(s.toLowerCase());
		long tmplong=0;
		for (int i=0;i<string.length();i++) {/// NOT FUNCTIONAL YET i usually would say id repair it in the future but lets be honest its not worth it
			for (char j : hex) {
				if (j == string.charAt(i)) {
				tmplong = (long) j-97+10+1; // ITS GONNNA BE MAGIC
				break;
				/*
					if (tmplong*16*string.length()-i+1<16) {
						returnlong+=tmplong;
						break;
					} 
					else {
						returnlong+=tmplong*16*string.length()-i+1; //if k=1 F=6+10*1 if K=2 F=6+10*? 16*16?
					break;
					}*/
				}
				else { 
					Character tmpchar = string.charAt(i);
					tmplong = tmpchar.charValue();
				}
			}
			
			System.out.println(tmplong);
			returnlong+=Math.pow(tmplong,i);
		}
		System.out.println(returnlong);
		return returnlong;
	}
}
