package arrayprograms;

public class CheckFirstAndLast {
	public static boolean isSame(int a[]) {
		return a[0]==a[a.length-1];
		
	}
	public static void main(String[] args) {
		int a[]= {2,3,46,5,6,8,2};
		System.out.println(	isSame(a));
	}

}
