package java8.methodreference;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class MethodRefrenceOperator {
	
	public static void main(String[] args) {
		
		//Filter all even no's & Convert them to string
		List<Integer> intList=Arrays.asList(12,15,36,48,64,78,89,100);
		
		Stream<Integer> stream1=intList.stream();
		Stream<Integer> stream2=stream1.filter(i->i%2==0);
		//Stream<String> stream2=stream1.map(i->String.valueOf(i));
		Stream<String> stream3=stream2.map(String::valueOf);
		
		stream3.forEach(System.out::println);
		
		//Short way
//		List<String> intString=intList.stream().filter(i->i%2==0).map(String::valueOf).toList();
//		intString.forEach(System.out::println);
//		
		
	}

}
