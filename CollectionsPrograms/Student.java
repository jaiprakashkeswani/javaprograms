package CollectionsPrograms;

import java.util.*;

public class Student {

	private String studentName;
	private int rollNo;
	private int studentAge;
	
	public Student(int rollNo, String studentName, int studentAge) {
		
		this.rollNo = rollNo;
		this.studentName = studentName;
		this.studentAge = studentAge;
				
	}
	
	public static Comparator<Student> StuNameComparator = new Comparator<Student>() {

		
		public int compare(Student s1, Student s2) {
			
			String StudentName1 = s1.studentName;
			String studentName2 = s2.studentName;
			
			return StudentName1.compareToIgnoreCase(studentName2);
			
		}
		
	};
	
	public static Comparator<Student> StuRollNo = new Comparator<Student>() {

		
		public int compare(Student s1, Student s2) {
			
			int RollNo1 = s1.rollNo;
			int RollNo2 = s2.rollNo;
			
			return RollNo1-RollNo2;
		}
		
	};
	
	public String toString() {
		
		return "[rollno=" + rollNo + ",name=" + studentName + ",age=" +studentAge+ ",]";
		
	}
	
	
		
}

