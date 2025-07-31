package collections.Sets;

import java.util.HashSet;
import java.util.Set;

public class HashSetInternal {
	public static void main(String[] args) {
		final Object PRESENT=new Object();
		
		HashSet<String> h=new HashSet<String>();
		
		h.add("A");
		h.add("B");
		h.add("C");
		
		System.out.println(h);
		
	}
}
