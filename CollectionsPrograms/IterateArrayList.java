package CollectionsPrograms;

import java.util.*;

public class IterateArrayList {

	public static void main(String[] args) {
		
		ArrayList<String> arrlst = new ArrayList<>();
		arrlst.add("Jai");
		arrlst.add("Navin");
		arrlst.add("Praven");
		arrlst.add("Chaitanya");
		arrlst.add("Sushil");
		
		Iterator itr = arrlst.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		for(String str:arrlst) {
			System.out.println(str);
		}

	}

}
