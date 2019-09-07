package CollectionsPrograms;

import java.util.*;

public class ReverseCollection {

	public static void main(String[] args) {
		
		String[] s = {"A", "B", "C", "D", "E"};
		List l = new ArrayList();
		
		for(int i=0;i<s.length;i++) {
			l.add(s[i]);
		}
		
		System.out.println("List before reversal");
		
		ListIterator litr = l.listIterator();
		
		while(litr.hasNext()) {
			System.out.println(litr.next());
		}
		
		Collections.reverse(l);
		
		System.out.println("List after reversal");
		
		litr = l.listIterator();
		
		while(litr.hasNext()) {
			System.out.println(litr.next());
		}
	}

}
