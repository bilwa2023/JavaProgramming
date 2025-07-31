package arrayprograms;

public class SecondMinimum {

	public static void main(String[] args) {
		int a[]= {2,3,46,5,6,8,3568};
		int min1;
		int min2=min1=Integer.MAX_VALUE;
		for(int i=0;i<a.length;i++) {
			if(a[i]<min1) {
				min2=min1;
				min1=a[i];
			}
			else if(a[i]>min1&&a[i]<min2){
				min2=a[i];
			}
		}
		
		System.out.println(min2);
	}

}
