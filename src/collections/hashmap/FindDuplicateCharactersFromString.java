package collections.hashmap;

import java.util.HashMap;
import java.util.Map;

public class FindDuplicateCharactersFromString {

	public static void main(String[] args) {
		String str="stringhavingduplicatecharacterzs";
		String str1="";
		
		for(int i=0;i<str.length();i++) {
			if(str1.indexOf(str.charAt(i))==-1) {
				str1+=str.charAt(i);
			}
		}
		HashMap<Character, Integer> map=new HashMap<Character, Integer>();
		
		for(int i=0;i<str1.length();i++) {
			int count =0;
			for(int j=0;j<str.length();j++) {
				if(str1.charAt(i)==str.charAt(j)) {
					count++;
				}
			}
			map.put(str1.charAt(i), count);
		}
		
		for(Map.Entry<Character, Integer> entry: map.entrySet() ) {
			if(entry.getValue()>1) {
				System.out.println(entry.getKey()+" : "+entry.getValue());
			}
		}
	}

}
