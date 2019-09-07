package CollectionsPrograms;

import java.util.HashSet;

public class CheckElementInHashSet {

	public static void main(String[] args) {
		
		HashSet<String> set = new HashSet<String>();
		
		set.add("Jai");
		set.add("Naveen");
		set.add("Praveen");
		set.add("Satish");
		set.add("Shiva");

		if(set.contains("Radha")) {
			System.out.println("Element is found in set");
		}else {
			System.out.println("Element is not found in set");
		}
	}

}
