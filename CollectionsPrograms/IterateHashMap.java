package CollectionsPrograms;

import java.util.*;

public class IterateHashMap {

	public static void main(String[] args) {

		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(1, "Jai");
		hm.put(2, "Satish");
		hm.put(3, "Praven");
		hm.put(4, "Prem"); 
		
		System.out.println("Iterate through enhanced for loop");
		
		for(int i: hm.keySet()) {
			System.out.println(hm.get(i));
		}
		
		System.out.println("------------------------------------------");
		
		System.out.println("Iterate through while loop using iterator and KeySet");
		
		Set<Integer> set =  hm.keySet();
		
		Iterator itr = set.iterator();
		
		while(itr.hasNext()) {
			
			System.out.println(hm.get(itr.next()));
		}
		
		System.out.println("------------------------------------------");
		
		System.out.println("Iterate through foreach loop and Entry Set");
		
		Set<Map.Entry<Integer, String>> setInt = hm.entrySet();

		for(Map.Entry entry:setInt) {
			
			System.out.println("key: " +entry.getKey() + " value: " +entry.getValue());
		}
		
		System.out.println("------------------------------------------");
		
		System.out.println("Iterate through while loop using iterator and Entry Set");
		
		Set<Map.Entry<Integer, String>> setInt1 = hm.entrySet();
		
		Iterator<Map.Entry<Integer, String>> itr1 = setInt1.iterator();

		while(itr1.hasNext()) 
		{
			Map.Entry entry = itr1.next();
			
			System.out.println("key: " +entry.getKey()+ " value: "+entry.getValue());
			
		}
	}

}
