package CollectionsPrograms;

import java.util.*;

public class SortHashMapByKeys {

	public static void main(String[] args) {
		
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		
		hm.put(4, "Prem");
		hm.put(2, "Satish");
		hm.put(1, "Jai");
		hm.put(3, "Praven");
 
		
		System.out.println("Map Values before sorting");
		
		Set<Map.Entry<Integer, String>> entryset = hm.entrySet();
		
		for(Map.Entry entry:entryset) {
			System.out.println("Key : " +entry.getKey()+ " Value : " +entry.getValue());
		}
		
		Map<Integer, String> tm = new TreeMap<Integer, String>(hm);
		
		System.out.println("Map Values after sorting");
		
		Set<Map.Entry<Integer,String>> entryset2 = tm.entrySet();
		
		for(Map.Entry entry : entryset2) {
			
			System.out.println("Key : " +entry.getKey() + " Value : " + entry.getValue());
		}

	}

}
