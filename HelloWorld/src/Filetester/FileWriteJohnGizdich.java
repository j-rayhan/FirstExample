package Filetester;

import java.io.*;
import java.util.Scanner;

public class FileWriteJohnGizdich {

	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		File file = new File("f:\\abc.txt");
		String texString = scanner.nextLine();
		if (!file.exists()) {
			file.createNewFile();
			System.out.println("New file hase benn created.");
		}
		FileWriter fileWriter = new FileWriter(file);
		BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
		bufferedWriter.write(texString);
		bufferedWriter.close();
		
	}

}
