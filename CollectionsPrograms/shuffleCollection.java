package CollectionsPrograms;

import java.util.*;

public class shuffleCollection {

	public static void main(String[] args) {
		
		ArrayList<String> obj = new ArrayList<String>();
		obj.add("A");
		obj.add("B");
		obj.add("C");
		obj.add("D");
		obj.add("E");
		System.out.println("Before Shuffling");
		System.out.println(obj);
		Collections.shuffle(obj);
		System.out.println("After Shuffling");
		System.out.println(obj);

	}

}
