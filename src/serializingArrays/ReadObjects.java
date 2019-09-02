package serializingArrays;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class ReadObjects {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws FileNotFoundException {
		System.out.println("Reading objects...");
		
		try {
			FileInputStream fi = new FileInputStream("test.ser");
			ObjectInputStream os = new ObjectInputStream(fi);
			
			Person[] people = (Person[]) os.readObject();
			
			ArrayList<Person> peopleList = (ArrayList<Person>) os.readObject();
			
			for(Person person : people) {
				System.out.println(person);
			}
			
			for(Person person : peopleList) {
				System.out.println(person);
			}
			os.close();
			
			
		} catch (IOException e) {
			
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
