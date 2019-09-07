package CollectionsPrograms;

import java.util.List;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class ArrayToCollectionConversion {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader in = new BufferedReader (new InputStreamReader(System.in));
		System.out.println("How many elements do you want to enter");
		int n = Integer.parseInt(in.readLine());
		String[] s = new String[n];
		
		for(int i=0;i<n;i++) {
			s[i] = in.readLine();
		}
		
		List<String> list = Arrays.asList(s); 
		
		for (String x: list) {
			System.out.println(x);
		}

	}

}
