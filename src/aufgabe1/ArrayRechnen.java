package aufgabe1;

public class ArrayRechnen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arrayEins[]= new int [5];
		arrayEins[0]=22;
		arrayEins[1]=2;
		arrayEins[2]=21;
		arrayEins[3]=18;
		arrayEins[4]=7;
		for (int i : arrayEins)	System.out.println(i);
		arrayEins[2]*=arrayEins[1]; // a = a*b
		arrayEins[0]/=arrayEins[4]; // a = a/b
		if (arrayEins[2]%arrayEins[4]==0) System.out.println("5. Element ist Teiler vom 3. Element");
		for (int i : arrayEins)	System.out.println(i);
	}

}
