package LesCollections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Maps {

	public static void main(String[] args) {
		
		HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
		@SuppressWarnings("unused")
		LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<Integer, String>();
		@SuppressWarnings("unused")
		TreeMap<Integer, String> treeMap = new TreeMap<Integer, String>();
		
		testMap(hashMap);
	}
	
	public static void testMap(Map<Integer, String> map) {
		map.put(1, "toyota matrix");
		map.put(2, "highlander");
		map.put(3, "toyota camry");
		map.put(4, "range rover");
		map.put(5, "fortuner");
		map.put(6, "chevrolet camaro");
		map.put(7, "benz cls");
		map.put(8, "kia sprotage");
		
		for(Integer key : map.keySet()) {
			
			String value = map.get(key);
			System.out.println(key + ":" + value);
		}
	}

}
