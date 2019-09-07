package CollectionsPrograms;

import java.util.*;

public class CheckElementInArrayList {

	public static void main(String[] args) {
		
		ArrayList<String> arrlst = new ArrayList<String>();
		
		arrlst.add("Jai");
		arrlst.add("Navin");
		arrlst.add("Praven");
		arrlst.add("Chaitanya");
		arrlst.add("Sushil");
		
		if(arrlst.contains("Radha")) {
			System.out.println("Element is available in arraylist");
		}else {
			System.out.println("Element is not available in arraylist");
		}

	}

}
