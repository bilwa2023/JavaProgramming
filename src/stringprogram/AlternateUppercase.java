package stringprogram;

public class AlternateUppercase {

	public static void main(String[] args) {
		String s="jai virat maiyaa ki";
		String str1="";
		for(int i=0;i<s.length();i++) {
			if(i%2==0) {
				str1+=(char)(s.charAt(i)-32);
			}
			else {
				str1+=s.charAt(i);
			}
		}
		System.out.println(str1);
	}

}
