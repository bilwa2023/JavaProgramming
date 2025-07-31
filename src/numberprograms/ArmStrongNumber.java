package numberprograms;

public class ArmStrongNumber {
	
	public static int noOfDigits(int n) {
		int count=0;
		while(n!=0) {
			count++;
			n/=10;
		}
		return count;
	}
	public static void main(String[] args) {
		int num=153;
		int temp=num;
		int digits=noOfDigits(num);
		int sum=0;
		while(num!=0) {
			int r=num%10;
			sum+=Math.pow(r, digits);
			num/=10;
		}
		
		if(temp==sum) {
			System.out.println("Is an ArmStrong Number");
		}
		else {
			System.out.println("Is not an ArmStrong Number");

		}
	}

}
