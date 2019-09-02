package LesCollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Personne {
	private int id;
	private String name;

	public Personne(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String toString() {
		return name;
	}

}

class StringLengthComparator implements Comparator<String> {

	@Override
	public int compare(String s1, String s2) {

		int len1 = s1.length();
		int len2 = s2.length();

		if (len1 > len2) {
			return 1;
		}

		else if (len1 < len2) {
			return -1;
		}
		return 0;
	}

}

class AlphabeticalComparator implements Comparator<String> {

	@Override
	public int compare(String s1, String s2) {

		return s1.compareTo(s2);
	}

}

class ReverseAlphabeticalComparator implements Comparator<String> {

	@Override
	public int compare(String s1, String s2) {

		return -s1.compareTo(s2);
	}

}

public class SortingList {

	public static void main(String[] args) {

////////////// SORTING STRING ////////////////////////////////	

		List<String> animals = new ArrayList<String>();
		animals.add("tiger");
		animals.add("lion");
		animals.add("cat");
		animals.add("snake");
		animals.add("mouse");
		animals.add("goat");

		// Collections.sort(animals, new StringLengthComparator());
		// Collections.sort(animals, new AlphabeticalComparator());
		Collections.sort(animals, new ReverseAlphabeticalComparator());
		for (String animal : animals) {

			System.out.println(animal);
		}

//////////////SORTING NUMBERS ////////////////////////////////	

		List<Integer> numbers = new ArrayList<Integer>();
		numbers.add(3);
		numbers.add(2);
		numbers.add(5);
		numbers.add(0);
		numbers.add(8);

		Collections.sort(numbers, new Comparator<Integer>() {

			@Override
			public int compare(Integer num1, Integer num2) {

				return -num1.compareTo(num2);
			}
		});

		for (Integer number : numbers) {
			System.out.println(number);
		}

//////////////SORTING ARBITRARY OBJECTS ////////////////////////////////	

		List<Personne> people = new ArrayList<Personne>();

		people.add(new Personne(1, "Joe"));
		people.add(new Personne(2, "Bob"));
		people.add(new Personne(3, "Clara"));
		people.add(new Personne(4, "Sue"));
		
		//sort in order of ID
		Collections.sort(people, new Comparator<Personne>() {
			@Override
			public int compare(Personne p1, Personne p2) {
				
				if(p1.getId() > p2.getId()) {
					return 1;
				}
				else if(p1.getId() < p2.getId()) {
					return -1;
				}
				return 0;
			}
		});
		
		for(Personne person : people) {
			System.out.println(person);
		}
		
		//sort in order of name
				Collections.sort(people, new Comparator<Personne>() {
					@Override
					public int compare(Personne p1, Personne p2) {
						
						return p1.getName().compareTo(p2.getName());
					}
				});
				
				for(Personne person : people) {
					System.out.println(person);
				}
	}
}
