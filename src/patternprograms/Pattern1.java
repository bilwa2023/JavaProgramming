public class Pattern1{
	public static void main(String [] args){
		int n=5,star=1;
		long start = System.nanoTime();
		for(int i=1;i<=n;i++){
			for(int j=1;j<=star;j++ ){
				System.out.print("*");			
			}
			System.out.println("");
			if(i<=n/2){
				star++;
			}
			else
				star--;
		}
		long end = System.nanoTime();
		long execution = end - start;
    		System.out.println("Execution time: " + execution + " nanoseconds");
	}
}