package collections.lists;

import java.util.ArrayList;
import java.util.Collections;

public class StudentArraylist {
	
	
	public static void main(String[] args) {
		ArrayList nolist1=new ArrayList();
		nolist1.add("637154886");	
		nolist1.add("636555144");	
		nolist1.add("7853052565");	
		nolist1.add("6987452357");
		nolist1.add(0,"9853546123");
		
		System.out.println(nolist1);
		Collections.sort(nolist1);
		System.out.println(nolist1);
		Student s1=new Student(23,"Odisha",nolist1);
		
		
	}
	
}
