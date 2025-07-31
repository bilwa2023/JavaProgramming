package arrayprograms;

public class MinimumElement {

	public static void main(String[] args) {
		int a[]= {2,3,46,5,6,8,38};
		int min=Integer.MAX_VALUE;
		for(int i=0;i<a.length;i++) {
			if(a[i]<min) {
				min=a[i];
				
			}
		}
		
		System.out.println(min);
	}

}
