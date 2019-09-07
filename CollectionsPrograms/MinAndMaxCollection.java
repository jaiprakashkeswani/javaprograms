package CollectionsPrograms;

import java.util.*;

public class MinAndMaxCollection {

	public static void main(String[] args) {
		
		 List<Integer> li = new ArrayList<>();
		
		int[] arr = new int[10];
		 for(int i=0;i<10;i++) {
			 arr[i] = i+1;
		 }
		 
		 for(int k=0;k<10;k++) {
		 System.out.println(arr[k]);
		 }
		 
		 for(int l=0;l<10;l++) {
		li.add(arr[l]);
		 }
		 
		 for(int j=0; j<li.size();j++) {
		 System.out.println(li.get(j));
		 }
		 
		 System.out.println("max: ," + Collections.max(li));
		 System.out.println("min: ," + Collections.min(li));

	}

}
