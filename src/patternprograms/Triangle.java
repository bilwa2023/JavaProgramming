package patternprograms;

public class Triangle {

	public static void main(String[] args) {
		int sp=3,star=1;
		for(int i=1;i<=4;i++) {
			for(int j=1;j<=sp;j++) {
				System.out.print("  ");
			}
			
			for(int j=1;j<=star;j++) {
				System.out.print(" *");
			}
			System.out.println();
			sp--;
			star+=2;
			
		}
		
		
	}

}
