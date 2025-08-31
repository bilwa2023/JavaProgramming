public class Pattern4{
	public static void main(String [] args){
		long start = System.nanoTime();
		int num=5,star=num,space=0;
		for(int i=1;i<=num;i++){
			for(int j=	1;j<=space;j++){
				System.out.print("  ");
			}
			for(int j=	1;j<=star;j++){
				System.out.print("* ");
			}
			System.out.println();
			space++;
		}
		long end = System.nanoTime();
		long execution = end - start;
    		System.out.println("Execution time: " + execution + " nanoseconds");

	}
}