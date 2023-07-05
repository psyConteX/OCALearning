package aufgabe1;

import java.util.Arrays;

public class arraygames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[] = {3,5,4,2,1};
		System.out.println(arr1[2]+"<- ZahlNr 3|ZahlNr 5->"+arr1[4]);
		System.out.println("ZahlNr4:"+arr1[3]);
		arr1[3]=9;
		System.out.println("ZahlNr4:"+arr1[3]);
		int arr2[] = {33,55,44,22,11};
		
			for (int i = 0; i<arr2.length;i++) {
			System.out.println("ZahlNr"+i+":"+arr2[i]);
			}
			for (int i = 0; i<arr2.length;i++) {
				arr2[i] = 0;
			}
			for (int i = 0; i<arr2.length;i++) { //aufgabe 6.
				System.out.println("ZahlNr"+i+":"+arr2[i]);
			}
			int arr3[] = new int[5];
			Arrays.fill(arr3, 5);
			
			for (int i = 0; i<arr3.length;i++) {
			System.out.println("ZahlNr"+i+":"+arr3[i]);
			}
			
			int arr4[] = {33,55,44,22,11};
			Arrays.sort(arr4);
			
			for (int i = 0; i<arr4.length;i++) {
			System.out.println("ZahlNr"+i+":"+arr4[i]);
			}
			
			String arr5[] = {"Test","Test","Test","Kest"}; //Aufgabe 9
			Arrays.sort(arr5);
			int index = Arrays.binarySearch(arr5,"Kest");
			System.out.println(index+" von arr5 ist: "+arr5[index]);
			
			String arr6[] = {"Test1","Test2","Test3","Kest4"}; //Aufgabe 10
			boolean check = Arrays.equals(arr5, arr6);
			if (check) {
				System.out.println("Array 5 und 6 sind :"+check);
			} else { Arrays.sort(arr6); }
			
			for (int i = 0; i<arr1.length;i++) {
				System.out.println("ZahlNr"+i+":"+arr1[i]);
				}
			System.out.println("Länge von arr5:"+arr5.length);
			for (int i = 0; i<arr5.length;i++) {
				System.out.println("ZahlNr"+i+":"+arr5[i]);

				}
			
			for (int j : arr1) {
				System.out.println(j);
				
//				System.out.println("ZahlNr"+j+":"+arr1[j]); ERROR j wird als element kopiert und greift mittels wert auf die index position
				}
			
			for (String i : arr5) {
				System.out.println(i);
				}
			
	}

}
