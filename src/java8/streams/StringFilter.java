package java8.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringFilter {
	public static void main(String[] args) {
		List<String> liststrings=Arrays.asList("Manohar","Dinesh","","Bilwa","Karishma",null);
		List<String> strings=liststrings.stream().filter(s->s!=null&&!s.isBlank()).collect(Collectors.toList());
		System.out.println(strings);
	}
}


//.filter(s->!s.isEmpty()