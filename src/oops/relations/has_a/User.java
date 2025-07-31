package oops.relations.has_a;

public class User {

	public static void main(String[] args) {
		Mobile mobile=new Mobile(12,64,new MobileBattery(4000,60));
		mobile.clickPicture();
	}

}
