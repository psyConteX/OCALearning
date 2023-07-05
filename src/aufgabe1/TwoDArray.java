package aufgabe1;

public class TwoDArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][];
		arr = new int[][] { {1,8,9},{4,2,10},{2,2,8} };
		
		for (int i=0;i<3;i++) {
			for (int j=0;j<3;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.print("\n");
		}
		
	}

}
