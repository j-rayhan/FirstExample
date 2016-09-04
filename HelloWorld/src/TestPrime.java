import java.util.Scanner;


public class TestPrime {
	static Scanner scanner = new Scanner(System.in);
public static void main(String[] args){
	while (true) {
		System.out.print("...Please insert Your Number: ");
		
		int i,number = scanner.nextInt();
		for ( i = 2; i < number; i++) {
			if (number%i==0) {
				System.out.println(number+"...Is Not Prime");
				break;
			}
		}
		if (number==i) {
			System.out.println(number+"....Is Prime");
			
		}
	}
//	System.out.print("...In...Not...Prime");
}
}
