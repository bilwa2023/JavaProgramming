package stringprogram;

public class LongestPalindromicSubstring {
	
	public static boolean isPalindrome(String s) {
		for(int i=0,j=s.length()-1;i<s.length();i++,j--) {
			if(s.charAt(i)!=s.charAt(j)) {
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		String str="hellomadamhii";
		StringBuilder sb=new StringBuilder("");
		
		for(int i=0;i<str.length()-1;i++) {
			for(int j=i;j<str.length();j++) {
				String s1=str.substring(i,j+1);
				if(isPalindrome(s1)&&s1.length()>sb.length()) {
					sb.replace(0, sb.length(), s1);
				}
			}
		}
		System.out.println(sb);

	}

}
