package arrayprograms;

public class MaxElement {

	public static void main(String[] args) {
		int a[]= {2,3,46,5,6,8,38};
		int max=Integer.MIN_VALUE;
		for(int i=0;i<a.length;i++) {
			if(a[i]>max) {
				max=a[i];
			}
		}
		System.out.println(max);
	}
}
