package creatingAndWritingTextFiles;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class createAndWrite {

	public static void main(String[] args) throws IOException {
		
		File file = new File("monjournal.txt");
		System.out.println(file.getAbsolutePath());
		FileWriter fr = new FileWriter(file);
		
		BufferedWriter br = new BufferedWriter(fr);
		br.write("I'm good java developer. I made my money in java programming");
		br.newLine();
		br.close();
		

	}

}
