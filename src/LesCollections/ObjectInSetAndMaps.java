package LesCollections;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

class Person{
	
	private int id;
	private String name;
	
	public Person(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}



	public String toString() {
		return "{ID is: "+ id +"; name is: "+ name +"}"; 
	}
	
	
}

public class ObjectInSetAndMaps {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		Person p1 = new Person(1, "Bob");
		Person p2 = new Person(2, "Alice");
		Person p3 = new Person(1, "Bob");
		Person p4 = new Person(4, "Sandra");
		Person p5 = new Person(3, "Jeff");
		Person p6 = new Person(1, "Bob");
		
		Map<Person, Integer> map = new LinkedHashMap<Person, Integer>();
		
		map.put(p1, 1);
		map.put(p2, 2);
		map.put(p3,3);
		map.put(p4, 4);
		map.put(p5, 5);
		
		for(Person key : map.keySet()) {
			System.out.println(key + ":" + map.get(key));
		}
		
		Set<Person> set = new LinkedHashSet<Person>();
		set.add(p1);
		set.add(p2);
		set.add(p3);
		set.add(p4);
		set.add(p5);
		
	}

}
