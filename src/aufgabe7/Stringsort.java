package aufgabe7;

public class Stringsort {
	
	int arraySize;
	String[] stringArray;
	int[] stringPos;
	
	Stringsort(String[] strings) {//test only
		arraySize = 3;
		stringArray = strings;
		stringPos=new int[arraySize];
		for (int i=0;i<arraySize;i++) stringPos[i]=0;
	}
	Stringsort(int aSize, String[] strings) {
		arraySize=aSize;
		stringArray=strings;
		stringPos=new int[aSize];
		for (int i=0;i<aSize;i++) stringPos[i]=0;
	}
	
	public void sortArrays() {
		for (int i=0;i<arraySize;i++) {
			for (int ii=i+1;ii<arraySize;ii++) { // warscheinlich ein fehler da inhalte übersprungen werden
			//StringBuilder checkString = new StringBuilder(stringArray[i]); old unused should delete
			stringPos[i] += stringArray[i].compareTo(stringArray[ii]);
			}
			//System.out.println(stringPos[i]);//pos wird als stärke indikator hinterlegt
		}
		String[] tmpstrings = stringArray;
		int[] tmpint = stringPos;
		for (int i=0;i<arraySize;i++) { // durchläuft array für bubblesort | absolut unnötig da hier einfacher methoden schon built in sind
			boolean tausch=false;
			for (int j=0;j<arraySize-i-1;j++) {
			if (stringPos[j]>stringPos[j+1]) {  	//bubblesort
				int temp=tmpint[j];					//erfassen integer variable für die bestimmung der position
				String tempstr=tmpstrings[j];		//erfassen des strings der gleich der position der integer variable ist
				tmpint[j]=tmpint[j+1];		
				tmpint[j+1]=temp;
				tmpstrings[j]=tmpstrings[j+1];
				tmpstrings[j+1]=tempstr;
				tausch = true;
				if (tausch==false) { break; }
				}
			}
		}
		stringArray = tmpstrings;
	}

}
