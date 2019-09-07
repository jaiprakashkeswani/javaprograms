package CollectionsPrograms;

import java.util.*;

public class RemoveElementFromCollection {

	public static void main(String[] args) {
		
		HashSet<String> set = new HashSet<>();
		set.add("Naveen");
		set.add("Jai");
		set.add("Praveen");
		set.add("Sumit");
		set.add("Chaitanya");
		set.add("Rajesh");
		set.add("Shiva");
		
		System.out.println("Size of the set is: " +set.size());
		
		Iterator itr = set.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

		set.remove("Chaitanya");
		
		System.out.println("Size of the set now is: " +set.size());
		
		itr = set.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	}

}
