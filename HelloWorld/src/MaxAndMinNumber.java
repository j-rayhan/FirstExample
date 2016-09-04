import java.util.Scanner;

public class MaxAndMinNumber {
	static Scanner myScanner = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Please first Insert your Length : ");
		int len = myScanner.nextInt();
		int max, min, number[] = new int[len];
		max = number[0];
		min = number[0];
		for (int i = 0; i < number.length; i++) {
			number[i]=myScanner.nextInt();
			if (max<number[i]) {
				max = number[i];
			}
			if (min>number[i]) {
				min = number[i];
			}
		}
		System.out.println("Max Number is = "+max);
		System.out.println("Min Number is = "+min);
	}

}
