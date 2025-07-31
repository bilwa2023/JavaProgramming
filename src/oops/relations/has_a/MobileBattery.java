package oops.relations.has_a;

public class MobileBattery {
	double capacity;
	int charging_time;
	
	public MobileBattery(double capacity,int charging_time) {
		this.capacity=capacity;
		this.charging_time=charging_time;
	}
	
	public void powerOn() {
		System.out.println("battery turned on ready to run");
	}
}
