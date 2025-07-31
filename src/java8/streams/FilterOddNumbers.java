 package java8.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterOddNumbers {

	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(12,11,10,15,16,18,20);
		
		List<Integer> odds=list.stream().filter(e->e%2==1).collect(Collectors.toList());
		System.out.println(odds);
		
	}

}
