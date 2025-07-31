package numberprograms;

public class SumOfMean {

	public static void main(String[] args) {
		int num=34873874;
		int sum=0;
		num/=10;
		while(num>10) {
			int r=num%10;
			sum+=r;
			num/=10;
		}
		System.out.println(sum);
	}
}
