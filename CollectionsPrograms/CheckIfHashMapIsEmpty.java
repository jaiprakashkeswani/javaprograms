package CollectionsPrograms;

import java.util.*;

public class CheckIfHashMapIsEmpty {

	public static void main(String[] args) {
		
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
	/*	hm.put(1, "Jai");
		hm.put(2, "Satish");
		hm.put(3, "Praven");
		hm.put(4, "Prem"); */
		
		if(hm.isEmpty())
		{
			System.out.println("Map is empty");
		} else {
			System.out.println("Map is not empty");
		}

	}

}
