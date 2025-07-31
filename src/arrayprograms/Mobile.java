package arrayprograms;

public class Mobile {
	int ram;
	double price;
	Mobile(int ram,double price){
		this.price=price;
		this.ram=ram;
	
	}
	@Override
	public String toString() {
		return "Mobile [ram=" + this.ram + ", price=" + this.price + "]";
	}
	
}

