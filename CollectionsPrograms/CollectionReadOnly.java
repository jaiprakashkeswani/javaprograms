package CollectionsPrograms;

import java.util.Arrays;
import java.util.*;

public class CollectionReadOnly {

	public static void main(String[] args) {
		
		List stuff = Arrays.asList(new String[]{"navin", "jai", "praveen"});
		List list = new ArrayList(stuff);
		list = Collections.unmodifiableList(list);
		try {
		list.add("jain");
		} catch(UnsupportedOperationException e) {
			System.out.println("List can not be modfied");
		}
		System.out.println(list);

	}

}
