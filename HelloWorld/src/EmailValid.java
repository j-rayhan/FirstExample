import java.util.Scanner;


public class EmailValid {
static Scanner myScanner = new Scanner(System.in);
	public static void main(String[] args) {

		String email = myScanner.nextLine();
		System.out.println("Insert  0 to exit");
		while (!email.contains("0")) {
			int at = email.indexOf("@");
			int dot = email.lastIndexOf(".");
			if (at>0&&dot<email.length()-1&&at<dot-1) {
				System.out.println("Valid Email : "+email);
			} else {
				System.out.println("Not Valid Email : "+email);
			}
			email = myScanner.nextLine();
		}
	}

}
