package stringprogram;

import java.util.HashMap;
import java.util.Map.Entry;

public class CharaterOccurences {
	public static void main(String[] args) {
		String s="aabbcccddeef";
		HashMap<Character, Integer> oc=new HashMap<Character, Integer>();
		for(int i=0;i<s.length();i++) {
			if(oc.containsKey(s.charAt(i))) {
				oc.put(s.charAt(i), oc.get(s.charAt(i))+1);
			}
			else {
				oc.put(s.charAt(i), 1);
			}
		}
		for(Entry<Character, Integer> p:oc.entrySet()) {
			System.out.println(p);
		}
	}
}
