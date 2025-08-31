public class Pattern5{
	public static void main(String [] args){
		long start = System.nanoTime();
		int num=5;
		for(int i=1;i<=num;i++){
			for(int j=	1;j<=num*2-1;j++){
				if((i+j>num)&&(i+j<=num*2)){
					System.out.print("* ");
				}
				else
					System.out.print("  ");

			}
			System.out.println();
		}
		long end = System.nanoTime();
		long execution = end - start;
    		System.out.println("Execution time: " + execution + " nanoseconds");
	}
}