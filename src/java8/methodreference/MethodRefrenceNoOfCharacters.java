package java8.methodreference;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class MethodRefrenceNoOfCharacters {
	public static String str;
	public static void main(String[] args) {
		
		//Convert all String to their no of characters
		List<String> nameList=Arrays.asList("Bilwa","Keetanu","tiger","Gobu");
		// O/p : [5,7,5,4]
		
		Stream<String> stream1=nameList.stream();
//		List<Integer> stream2=stream1.map(s->s.length()).toList();
//		
//		System.out.println(stream2);
		
		
		Stream<Integer> stream3=stream1.map(String::length);
		stream3.forEach(System.out::println);
		
	}

}
