package stringprogram;

public class CountWords {
	public static void main(String[] args) {
		String s="It   is our right to demand treat";
		int count=0;
		boolean word=false;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)!=' ' && !word) {
				word=true;
				count++;
			}
			else if(s.charAt(i)==' ') {
				word=false;
			}
		}
		System.out.println(count);
		
	}
}
