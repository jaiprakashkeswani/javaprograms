package CollectionsPrograms;

import java.util.*;

public class IterateHashSet {

	public static void main(String[] args) {
		
		HashSet<String> set = new HashSet<String>();
		
		set.add("Jai");
		set.add("Naveen");
		set.add("Praveen");
		set.add("Satish");
		set.add("Shiva");
		
		Iterator itr = set.iterator();
		
		while(itr.hasNext()) {
			
			System.out.println("set value is : "+itr.next());
			
		}

		for(String str: set) {
			
			System.out.println("set value is : "+str);
			
		}
		
		ArrayList<String> arrlst = new ArrayList<String>();
		
		for(String str: set) {
			
			arrlst.add(str);
			
		}
		
		for(int i=0;i<arrlst.size();i++) {
			
			System.out.println("list value is : " +arrlst.get(i));
		}
	}

}
