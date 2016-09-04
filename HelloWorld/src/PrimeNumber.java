import java.util.Scanner;


public class PrimeNumber {
	static Scanner myScanner=new Scanner(System.in);
	public static void main(String[] args) {
//while (true) {
//	
//	System.out.println("Please input your Number ");
//	int j,num=myScanner.nextInt();
//	for ( j = 2; j < num; j++) { 
//		
//		if (num%j==0) {
//			System.out.println("Is not prime");
//			break;
//		} 
//	}
//	if (num==j) {
//		System.out.println("Is prime");
//	}
//}
		System.out.println("Please insert your Number: ");
		int i , number = myScanner.nextInt();
		if (number <=1) {
			System.out.println(" Small prime number is 2");
		}else {
			
			for ( i = 2; i < number; i++) {
				if (number% i == 0) {
					System.out.println(number+"  ... is not a prime");
					break;
				}
			}
			if (number == i) {
				System.out.println(number+" is a prime");
			}
		}
		
	}

}
