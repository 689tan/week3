package week3;

public class Week3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a = 12 ;
int b = 10 ;



if (a > 2 && b > 2) {
	int [][] arr = new int[a][b] ;
	
	for (int row = 0 ; row < a ; row++) {
		for (int column = 0 ; column < b ; column++) {
			arr[row][column] = column;
			
		}
	}
	System.out.println(arr[0][arr[0].length - 1]);
}else {
	System.out.println("Both numbers need to be greater than 2.");
}
	}
// this is a change.
}