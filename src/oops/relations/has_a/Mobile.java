package oops.relations.has_a;

public class Mobile {
	
	int ram;
	double cameraPixel;
	MobileBattery mb;
	public Mobile(int ram, double cameraPixel, MobileBattery mb) {
		super();
		this.ram = ram;
		this.cameraPixel = cameraPixel;
		this.mb = mb;
	}
	
	public void clickPicture() {
		mb.powerOn();
		System.out.println("Picture clicked kichik...🌟");
	}
}
