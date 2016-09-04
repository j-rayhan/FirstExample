package Filetester;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class IOFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File inputFile=new File("f:\\abc.txt");
		File outputFile=new File("f:\\abcde.txt");
		
		try {
			FileReader fileReader = new FileReader(inputFile);
			try {
				FileWriter fileWriter = new FileWriter(outputFile);
				
				Scanner scanner = new Scanner(System.in);
				while (scanner.hasNext()) {
					String tempString = scanner.nextLine();
					// System.out.println(tempString);
					fileWriter.write(tempString + "\n");
				}
				fileReader.close();
				
				fileWriter.close();
				
			} catch (IOException e) {
				e.printStackTrace();
			}
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
	}

}
