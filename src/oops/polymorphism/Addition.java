package oops.polymorphism;

public class Addition {
	
	int a=20;
	double b=23;
	
	public void add(int a,double b) {
		double sum =this.a + this.b;//dynamic adddition
		System.out.println(sum);
	}
	public void add() {
		double sum=a+b;//static addition
		System.out.println(sum);
	}
}
