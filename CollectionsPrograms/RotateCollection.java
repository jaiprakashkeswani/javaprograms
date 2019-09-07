package CollectionsPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class RotateCollection {

	public static void main(String[] args) {
		
		String[] strarr = {"one", "two", "three", "four", "five", "six", "seven", "eight"};
		
		ArrayList<String> strlist = new ArrayList<String>();
		
		List lst = Arrays.asList(strarr);
		
	/*	for(String str: strarr) {
			strlist.add(str);
		}*/
		
		System.out.println("List before rotating element, " +lst);
		
		Collections.rotate(lst, 4);
		
		System.out.println("List after rotating element, " +lst);
		

	}

}
