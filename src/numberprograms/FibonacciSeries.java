package numberprograms;

public class FibonacciSeries {
	
	public static void main(String[] args) {
		int a=0,b=1;
		int n=10;

		for(int i=1;i<=n;i++) {
			int c=a+b;
			System.out.println(a);
			a=b;
			b=c;
		}
	}
}
