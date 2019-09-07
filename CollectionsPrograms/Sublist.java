package CollectionsPrograms;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Sublist {

	public static void main(String[] args) {
		
		List list = Arrays.asList("one", "two", "three", "four", "five", "six", "seven");
		System.out.println("List :" +list);
		List sublist = Arrays.asList("three", "four");
		System.out.println("sublist :" +sublist);
		
		System.out.println("IndexOfSubList :" +Collections.indexOfSubList(list, sublist));
		
		System.out.println("LastIndexOfSubList :" +Collections.lastIndexOfSubList(list, sublist));
		
	}

}
