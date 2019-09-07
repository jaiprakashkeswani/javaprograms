package CollectionsPrograms;

import java.util.*;

public class ReplaceElementInCollection {

	public static void main(String[] args) {
		
		String[] strarr = {"one", "two", "three", "four", "five", "six", "seven", "eight"};
		
		ArrayList<String> strlist = new ArrayList<String>();
		
		for(String str: strarr) {
			strlist.add(str);
		}
		
		System.out.println("List before replacing element, " +strlist);
		
		Collections.replaceAll(strlist, "one", "hundred");
		
		System.out.println("List after replacing element, " +strlist);

	}

}
