package CollectionsPrograms;

import java.util.*;

public class CollectionToArrayConversion {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>();
		list.add("This ");
		list.add("is ");
		list.add("a ");
		list.add("very ");
		list.add("good ");
		list.add("idea ");
		
		String[] s1 = list.toArray(new String[0]);
		
		for(int i=0; i<s1.length; ++i) {
			System.out.print(s1[i]);
		}

	}

}
