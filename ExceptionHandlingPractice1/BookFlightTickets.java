package ExceptionHandlingPractice1;

class SeatUnavailableException extends Throwable{
	SeatUnavailableException(String msg){
		super(msg);
	}
}

public class BookFlightTickets {
	static void checkSeats(int availableSeats, int bookingSeats) throws SeatUnavailableException{
		if(bookingSeats > availableSeats) {
			throw new SeatUnavailableException("Seats not available, Exception created");
		}
		else {
			System.out.println("Seats booked successfully");
		}
	}
	public static void main(String[] args) {
		try {
			checkSeats(10, 14);
		}
		catch(SeatUnavailableException e) {
			System.out.println(e.getMessage());
		}
	}
}
