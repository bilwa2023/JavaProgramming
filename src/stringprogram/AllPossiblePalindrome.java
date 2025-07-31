package stringprogram;

public class AllPossiblePalindrome {
	
	public static boolean isPalindrome(String s) {
		for(int i=0,j=s.length()-1;i<s.length();i++,j--) {
			if(s.charAt(i) !=s.charAt(j)) {
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		String s="abcababaabc";
		
		for(int i=0;i<s.length()-1;i++) {
			String p="";
			for(int j=i+1;j<s.length();j++) {
				p+=s.charAt(j);
				
				if(p.length()>1 && isPalindrome(p)) {
					System.out.println(p);
				}
			}
			
		
		}
	}

}
