package arrayprograms;

public class PrintElements {
	public static boolean nonPrime(int n) {
		if(n<2) {
			return true;
		}
		for(int i=2;i<=n/2;i++) {
			if(n%i==0) {
				return true;
			}
		}
		return false;
	}
	
//	public static boolean isPrime(int n) {
//		if(n<2) {
//			return false;
//		}
//		for(int i=2;i<=n/2;i++) {
//			if(n%i==0) {
//				return false;
//			}
//		}
//		return true;
//	}
	
	public static void main(String[] args) {

		int a[]= {5,6,3,8,9,2,4,1};
		for(int i=0;i<a.length;i++) {
			if(!nonPrime(a[i])) {
				System.out.println(a[i]);
			}
		}
	}

}
