package jsp.constructor;

public class ConstructorOverloading {
	int a;
	int b;
	
	public ConstructorOverloading() {
		int c=this.a + this.b;
		System.out.println(c);
	}
	public ConstructorOverloading(int a) {
		int b=20;
		int c=a+b;System.out.println(c);
	}
	public ConstructorOverloading(int a,int b) {
		this.a=a;
		this.b=b;
		int c=this.a+this.b;
		System.out.println(c);
	}
	public static void main(String[] args) {
		
//		ConstructorOverloading c1=new ConstructorOverloading();
//		ConstructorOverloading c2=new ConstructorOverloading(23);
		ConstructorOverloading c3=new ConstructorOverloading(45,78);
	}

}
