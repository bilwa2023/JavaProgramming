package patternprograms;

public class Number1 {

	public static void main(String[] args) {
		int n=4,m=0;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n-m;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
			m++;
		}
	}

}
