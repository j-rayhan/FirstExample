import java.util.Scanner;

public class SumWithCondetion {
static Scanner myScanner= new Scanner(System.in);
	public static void main(String[] args) {
		System.out.print("Insert Your Posetive Number (insert Negative Number for Stop)");
		System.out.println("");
		int sum = 0,number = myScanner.nextInt();
		while (number>0) {
			sum += number;
			number = myScanner.nextInt();
		}
		System.out.println("Total : "+sum);
	}

}
