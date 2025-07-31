package jsp.constructor;

public class ConstructorChaining {
	String name;
	int id;
	public ConstructorChaining() {
		this("Bilwa");
		System.out.println("No Argument Constructor");
	}
	public ConstructorChaining(String name) {
		
		System.out.println("Hii "+ name);
		System.out.println("Parameterized Constructor");
	}
	
	public static void main(String[] args) {
		
		ConstructorChaining ch=new ConstructorChaining();
		
	}

}
