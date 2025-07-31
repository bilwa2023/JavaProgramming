package java8.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringFilterStartingWithA {

	public static void main(String[] args) {
		List<String> names=Arrays.asList("Manohar","ashish","Bilwa","Aman","Arbas");
		List<String> namesA=names.stream().filter(s->s.charAt(0)=='a'||s.charAt(0)=='A').map(s->s.toUpperCase()).collect(Collectors.toList());
		System.out.println(namesA);
		
	}

}
