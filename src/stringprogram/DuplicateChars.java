package stringprogram;

public class DuplicateChars {

	public static void main(String[] args) {
		String str="aabcdcba";
		
		
		for(int i=0;i<str.length();i++) {
			int c=1;
			for(int j=i+1;j<str.length();j++) {
				if(str.charAt(j)==(str.charAt(i))) {
					c++;
				}
			}
			if(c>1) {
				System.out.println(str.charAt(i));
			}
		}
		
	}
}
