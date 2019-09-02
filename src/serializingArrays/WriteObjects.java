package serializingArrays;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;

public class WriteObjects {

	public static void main(String[] args) {
		
		System.out.println("Writting objects...");
		
		Person[] people = {new Person(1, "Sue"), new Person(2, "Mike"),
				new Person(3, "Bob"), new Person(4, "Alcia")};
		
		ArrayList<Person> peoplelist = new ArrayList<Person>(Arrays.asList(people));
		
		
		try {
			FileOutputStream fs = new FileOutputStream("test.ser");
			
			ObjectOutputStream os = new ObjectOutputStream(fs);
			
			os.writeObject(people);
			
			os.writeObject(peoplelist);
			os.close();
			 
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		}
			
	}
}
