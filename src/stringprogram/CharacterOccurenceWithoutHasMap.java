package stringprogram;

public class CharacterOccurenceWithoutHasMap {

	public static void main(String[] args) {
		String s="aabbcccddeef";
		String s1="";
		for(int i=0;i<s.length();i++) {
			if(!s1.contains(s.charAt(i)+"")) {
				s1+=s.charAt(i);
			}
		}
		
		for(int i=0;i<s1.length();i++) {
			int count=0;
			for(int j=0;j<s.length();j++) {
				if(s1.charAt(i)==s.charAt(j)) {
					count++;
				}
			}
			System.out.println(s1.charAt(i)+":"+count);
		}
	}

}
