package collections.railbooking;

public class Passenger {
	private String contact;
	private String name;
	
	public Passenger(String contact,String name) {
		this.name=name;
		this.contact=contact;
	}

	@Override
	public String toString() {
		return "Passenger [contact=" + contact + ", name=" + name + "]";
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
