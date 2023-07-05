package aufgabe1;

public class Kalorienzaehlen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] personenKalorien = 	{{3, 1000,2000,3000},
									{1,4000},
									{2,5000,6000},
									{3,7000,8000,9000},
									{1,10000}};
		int summe[]=new int[5];
		int anzahl[]=new int[5];
		int max=0;

		for (int i = 0;i<personenKalorien.length;i++) {
			
			for (int j=0;j<personenKalorien[i].length;j++) {
				
				if (j==0) anzahl[i]=personenKalorien[i][j];
				else summe[i] += personenKalorien[i][j];
			}
		}
		for (int i = 0;i<personenKalorien.length;i++) { 
			if (summe[i]>summe[max]) max=i; 
		}
		System.out.println("Der Forcher Nr. "+(max+1)+" hat mit "+summe[max]+" am meisten Kalorien bestehend aus "+anzahl[max]+" Lebensmitteln");
	}
}
