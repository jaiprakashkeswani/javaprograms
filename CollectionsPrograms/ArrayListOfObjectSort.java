package CollectionsPrograms;

import java.util.*;
import java.lang.*;

public class ArrayListOfObjectSort {

	public static void main(String[] args) {
		
		ArrayList<Student> arrlst = new ArrayList<Student>();
		arrlst.add(new Student(111, "Yashwant", 26));
		arrlst.add(new Student(222, "Rajesh", 40));
		arrlst.add(new Student(333, "Rajesh", 33));
		
		Collections.sort(arrlst, Student.StuNameComparator);

		for(Student str:arrlst) {
			
			System.out.println(str);
		}
		

	}

}
