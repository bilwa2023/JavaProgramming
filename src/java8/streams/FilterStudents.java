package java8.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FilterStudents {
	public static void main(String[] args) {
		List<Student> studentlist=new ArrayList<Student>();
		studentlist.add(new Student(101,"Anas",86));
		studentlist.add(new Student(102,"Mahesh",85));
		studentlist.add(new Student(103,"Bilwa",90));

		Stream<Student> stream=studentlist.stream();
		List<String> slist=stream.filter(s->s.marks>=86).map(s->s.name).collect(Collectors.toList());
		System.out.println(slist);
		
	
	}

}
