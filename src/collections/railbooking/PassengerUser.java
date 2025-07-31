package collections.railbooking;

public class PassengerUser {

	public static void main(String[] args) {
		
		RailwayBookingSystem bs=new RailwayBookingSystem();
		Passenger p=new Passenger("9123145678","John");
		bs.bookTicket(new Passenger("6371549886","Bilwa"));
		bs.bookTicket(new Passenger("7853052565","Kituu"));
		bs.bookTicket(p);
		bs.bookTicket(new Passenger("7896445321","Joyle"));
		bs.bookTicket(new Passenger("6549871232","Don"));
		bs.bookTicket(new Passenger("8564794566","Messiah"));
		bs.bookTicket(new Passenger("7896541230","Manish"));
		bs.bookTicket(new Passenger("88779966554","Arbas"));
		bs.bookTicket(new Passenger("99887774556","Jumbo"));
//		bs.bookTicket(new Passenger("77889654123","Tiger"));
		
		bs.displayAllBookings();
		bs.cancelTicket(p);
		bs.displayAllBookings();
		bs.displayStatus("7853052565");
	}

}
