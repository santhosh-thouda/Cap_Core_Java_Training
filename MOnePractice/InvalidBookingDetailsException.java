package MOnePractice;

public class InvalidBookingDetailsException extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	InvalidBookingDetailsException(String msg) {
		super(msg);
	}
}
