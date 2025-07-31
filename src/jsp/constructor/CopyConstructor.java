package jsp.constructor;

public class CopyConstructor {
	int a;
	int b;
	public CopyConstructor(int a,int b) {
		this.a=a;
		this.b=b;
	}
	public CopyConstructor(CopyConstructor c) {
		this.a=c.a;
		this.b=c.b;
	}
	
	
	public static void main(String[] args) {
		CopyConstructor	cp=new CopyConstructor(20, 30);
		cp.a=25;
		
		CopyConstructor cq=new CopyConstructor(cp);
		cq.a=35;
		System.out.println(cp.a);
		System.out.println(cq.a);
	}
}
