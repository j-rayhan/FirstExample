import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.Vector;


public class Hello extends Vector{
static Scanner sc= new Scanner(System.in);
	public static void main(String[] args) throws Exception {
		boolean bool=true;
		if (bool=false) {
			System.out.println("A");
		} else if (bool) {
			System.out.println("B");
		} else if (!bool) {
			System.out.println("C");
		} else {
			System.out.println("D");
		}
		
		int i=1;int j = -1;
		switch (i) {
		case  1:j=1;
			
		case 2:j=2;

		default:j=0;
			break;
		}
		System.out.println("j "+j);
	}

}
