package serializationSavingObjectsToFiles;

import java.io.Serializable;

public class Person implements Serializable{
	private static final long serialVersionUID = -2711151284855445218L;
	
	private int id;
	private String name;
	
	public Person(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Person[id="+id+", name="+name+"]";
		
	}
	

}
