package LesCollections;

import java.util.Iterator;
import java.util.LinkedList;

public class LesIterations {

	public static void main(String[] args) {

		LinkedList<String> animals = new LinkedList<String>();

		animals.add("fox");
		animals.add("cat");
		animals.add("dog");
		animals.add("rabbit");
		animals.add("snake");
		animals.add("bird");

		Iterator<String> it = animals.iterator();

		while (it.hasNext()) {
			String value = it.next();
			System.out.println(value);

			if (value.equals("cat")) {
				it.remove();
			}
		}

		// Iterator fait la même chose que la boucle for

//		for(String animal : animals) {
//			System.out.println(animal);
//		}

	}

}
