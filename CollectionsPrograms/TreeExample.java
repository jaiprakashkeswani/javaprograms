package CollectionsPrograms;

import java.util.*;

public class TreeExample {

	public static void main(String[] args) {
		
		System.out.println("Tree Map Example!\n");
		
		TreeMap<Integer, String> tMap = new TreeMap<Integer, String>();
		
		tMap.put(1, "Sunday");
		tMap.put(2, "Monday");
		tMap.put(3, "Tuesday");
		tMap.put(4, "Wednesday");
		tMap.put(5, "Thursday");
		tMap.put(6, "Friday");
		tMap.put(7, "Saturday");
		
		System.out.println("Keys of Tree Map: " + tMap.keySet());
		System.out.println("Values of Tree Map: " + tMap.values());
		System.out.println("Key: 5 value: " + tMap.get(5));
		System.out.println("First Key: " + tMap.firstKey());
		System.out.println("Last Key: " + tMap.lastKey());
		System.out.println("First Entry: " + tMap.firstEntry());
		System.out.println("Last Entry: " + tMap.lastEntry());
		System.out.println("First Key: " + tMap.firstKey() + " First Value :" + tMap.get(tMap.firstKey()));
		System.out.println("Last Key: " + tMap.lastKey() + " Last Value: " + tMap.get(tMap.lastKey()));
		System.out.println("Removing First data value: " + tMap.remove(tMap.firstKey()));
		System.out.println("Keys sof Tree Map Now: " + tMap.keySet());
		System.out.println("Values of Tree Map now" +tMap.values());
		System.out.println("First Key: " + tMap.firstKey());
		System.out.println("Last Key: " + tMap.lastKey());
	}

}
