package collections.hashmap;

import java.util.HashMap;
import java.util.Map;

public class ExampleHashMap {

	public static void main(String[] args) {
		
		
		Student s1=new Student(101);
		Student s2=new Student(102);  
		HashMap<Student, String> map=new HashMap<Student, String>();
		
		
		if(s1.equals(s2)) {
			System.out.println("Duplicate Student record");
		}
		else {
			map.put(s1, "Rafiq");
			map.put(s2, "Bilwa");
			System.out.println("Student record saved");
			
		}
		System.out.println(map.get(s1));
//		
////		Map<String,Integer> m=new HashMap<String,Integer>();
////		m.put("A", 12);
////		m.put("A", 15);
////		m.put("C", 19);
////		
////		System.out.println(m);
	}

}
