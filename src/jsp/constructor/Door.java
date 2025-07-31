package jsp.constructor;

public class Door {
	
	String material;
	double length;
	public Door(String material,double length) {	//Dynamic initialization of fields
		this.material=material;
		this.length=length;
		System.out.println(10/0);
		System.out.println("dddd");
		return;
	}
	public  Door() {  //Static initialization of fields
		this.length=3;
		this.material="wood";
	}
	public static void main(String[] args) {
	System.out.println("Talupulu");
	Door door=new Door("Aluminium",4);
	}
}
