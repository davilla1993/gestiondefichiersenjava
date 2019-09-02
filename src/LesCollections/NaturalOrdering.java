package LesCollections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

// La classe Person est déjà définie dans une autre classe du même package et ne peut 
// plus donc prendre le même nom. Pour le différencier, je la précède de i

class iPerson implements Comparable<iPerson>{
	private String name;

	public iPerson(String name) {
		super();
		this.name = name;
	}
	
	public String toString() {
		return name;
	}
	
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
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
		iPerson other = (iPerson) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public int compareTo(iPerson person) {
		
		int len1 = name.length();
		int len2 = person.name.length();
		
		if(len1 > len2) {
			return 1;
		}
		else if(len1 < len2) {
			return -1;
		}else {
			return name.compareTo(person.name);
		}
		
	}
}

public class NaturalOrdering {

	public static void main(String[] args) {
		List<iPerson> list = new ArrayList<iPerson>();
		SortedSet<iPerson> set = new TreeSet<iPerson>();
		
		addElements(list);
		addElements(set);
		
	// 	Collections.sort(list);
		
		showElements(list);
		showElements(set);
		
	}

	private static void addElements(Collection<iPerson> col) {
		col.add(new iPerson("Joe"));
		col.add(new iPerson("Sue"));
		col.add(new iPerson("Juliet"));
		col.add(new iPerson("Claire"));
		col.add(new iPerson("Mike"));
	}
	
	private static void showElements(Collection<iPerson> col) {
		
		for(iPerson element : col) {
			System.out.println(element); 
		}
	}
}