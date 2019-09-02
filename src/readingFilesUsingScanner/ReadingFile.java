package readingFilesUsingScanner;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadingFile {

	public static void main(String[] args) throws FileNotFoundException {
		
		String fileName = "exemple.txt";
		
		File textFile = new File(fileName);
		
		Scanner in = new Scanner(textFile);
		
		int count = 2;
		while(in.hasNextLine()) {
			String line = in.nextLine();
			
			System.out.println(count + ":" + line);
			count++;
		}
		
		in.close();
		}

}
