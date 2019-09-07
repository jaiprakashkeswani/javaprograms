package CollectionsPrograms;

import java.util.*;

public class ListToArrayConversion {

	public static void main(String[] args) {
	
		ArrayList<String> arrstr = new ArrayList<String>();
		arrstr.add("Jai");
		arrstr.add("Praveen");
		arrstr.add("Shiva");
		arrstr.add("Naveen");
		arrstr.add("Rajesh");
		
		System.out.println("List elements: " +arrstr);
		
		String[] strarr = new String[arrstr.size()];
		
	for(int i=0;i<arrstr.size();i++) {
		strarr[i] = arrstr.get(i);
	}

	System.out.println("Array elements");
	
	for(String str:arrstr) {
		System.out.println(str);
	}
	
	}

}
