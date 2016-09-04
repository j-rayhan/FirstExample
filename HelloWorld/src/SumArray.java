import java.util.Scanner;


public class SumArray {
	static Scanner myScanner = new Scanner(System.in);
	public static void main(String[] args) {
//		System.out.println("...Please Insert Your Number.... =");
//		
//		int [][] number = new int[2] [3];
//		int sum = 0;
//		for (int i = 0; i < 2; i++) {
//			for (int j = 0; j < 3; j++) {
//				number[i][j] = myScanner.nextInt();
//				sum += number[i][j];
//			}
//		}
//		System.out.println("Your Input Number Of Sum = "+sum);
//		
//		for (int i = 0; i < 2; i++) {
//			for (int j = 0; j < 3; j++) {
//				System.out.print("\t"+number[i][j]);
//				
//			}System.out.println("");
//		}
		
		System.out.println("Please insert your Number : ");
		int [] [] number = new int[2][3];
		int sum = 0;
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 3; j++) {
				number[i][j] = myScanner.nextInt();
				sum+=number[i][j];
			}
		}
		System.out.println("Your Input Number Sum Is ="+sum);
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print("\t"+number[i][j]);
				
			}System.out.println("");
		}

	}

}
