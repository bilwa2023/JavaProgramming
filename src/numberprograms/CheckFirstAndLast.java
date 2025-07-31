package numberprograms;

public class CheckFirstAndLast {

	public static void main(String[] args) {
		int num=438614;
		int last=num%10;
		while(num>10) {
			num/=10;
		}
		int first=num;
		System.out.println(first==last);
	}
}
