package arrayprograms;

public class SecondMaximum {

	public static void main(String[] args) {
		int a[]= {2,3,46,5,6,8,3568};
		int max1;
		int max2=max1=Integer.MIN_VALUE;
		
		for(int i=0;i<a.length;i++) {
			if(a[i]>max1) {
				max2=max1;
				max1=a[i];
				
			}
			else if(a[i]<max1&&a[i]>max2) {
				max2=a[i];
			}
		}
		System.out.println("Max : "+max1);
		System.out.println("2nd MAx : "+max2);
	}

}
