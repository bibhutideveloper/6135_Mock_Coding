import java.util.Scanner;

public class RightAngledTriangle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no. of rows: ");
		int size=sc.nextInt();
		
		// creating rows
		for(int row=1; row<=size; row++) {
			// creating column with *
			for(int col=1; col<=row; col++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		sc.close();
	}

}

//      Enter no. of rows: 
//		5
//		* 
//		* * 
//		* * * 
//		* * * * 
//		* * * * * 
