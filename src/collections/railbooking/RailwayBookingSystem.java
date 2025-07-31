package collections.railbooking;

import java.util.*;

public class RailwayBookingSystem {
	public static final int max_confirmedSeats=6;
	public static final int max_waitingSeats=3;
	
	List<Passenger> confirmedList=new ArrayList<Passenger>();
	LinkedList<Passenger> waitingList=new LinkedList<Passenger>();
	
	public void bookTicket(Passenger passenger) {
		if(confirmedList.size()<max_confirmedSeats) {
			confirmedList.add(passenger);
			System.out.println("Ticket confirmed for "+passenger.getName());
		}
		else if(waitingList.size()<max_waitingSeats) {
			waitingList.add(passenger);
			System.out.println(passenger.getName()+" Your ticket is in Waiting list for waiting no: "+waitingList.indexOf(passenger)+1);
		}
		else {
			System.out.println("All tickets are reserved now.. Try later");
		}
	}
	
	public void cancelTicket(Passenger passenger) {
		if(confirmedList.contains(passenger)) {
			confirmedList.remove(passenger);
			System.out.println("Ticket Cancelled Successfully..");
			
			if(!waitingList.isEmpty()) {
				confirmedList.add(waitingList.poll());
				System.out.println("Waiting List upgraded");
			}
		}
		else if(waitingList.contains(passenger)) {
			waitingList.remove(passenger);
			System.out.println("Booking cancelled permanently");
			
		}
		else {
			System.out.println("Passenger not found.");
		}
	}
	public void displayAllBookings() {
		System.out.println(">>>>> Confirmd Bookings <<<<<");
		confirmedList.forEach(p->System.out.println(p));
		
		System.out.println(">>>>> Waiting List <<<<<");
		waitingList.forEach(p->System.out.println(p));
	}
	public void displayStatus(String contact) {
		Passenger passenger=confirmedList.stream().filter(p->p.getContact().equals(contact)).findAny().orElse(null);
		Passenger passengerwaiting=waitingList.stream().filter(p->p.getContact().equals(contact)).findAny().orElse(null);
		if(passenger!=null) {
			System.out.println(passenger.getName()+" at Confirmed "+(confirmedList.indexOf(passenger)+1));
		}
		else if(passengerwaiting!=null) {
			System.out.println(passengerwaiting.getName()+" at Waiting "+(waitingList.indexOf(passengerwaiting)+1));
		}
		else {
			System.out.println("No booking found");
		}
	}
	
}
