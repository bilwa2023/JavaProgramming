package numberprograms;

public class SumOfExtreme {
	public static void main(String[] args) {
		int num=538614;
		int sum=num%10;
		while(num>10) {
			num/=10;
		}
		sum+=num;
		System.out.println(sum);
	}
}
