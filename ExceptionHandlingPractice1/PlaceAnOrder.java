package ExceptionHandlingPractice1;

class InvalidCouponException extends Exception{
	InvalidCouponException(String msg){
		super(msg);
	}
}

class PaymentGatewayTimeoutException extends Exception{
	PaymentGatewayTimeoutException(String msg){
		super(msg);
	}
}

class AddressNotFoundException extends Exception{
	AddressNotFoundException(String msg){
		super(msg);
	}
}

public class PlaceAnOrder {
	static void checkCoupon(String coupon) throws InvalidCouponException{
		String[] coupons = {"half50", "halfflat50", "90percenthalf", "diwalidamaka", "coupon20", "coupon10", "coupon50"};
		
		boolean valid = false;
		for(String s : coupons) {
			
			if(s.equals(coupon)) {
				
				valid = true;
				break;
			}
		}
		
		if(valid) {
			System.out.println("Coupon applied");
		}
		else {
			throw new InvalidCouponException("Invalid Coupon, enter the valid one");
		}
	}
	
	static void checkPaymentTime(int seconds) throws PaymentGatewayTimeoutException{
		if(seconds > 60) {
			throw new PaymentGatewayTimeoutException("Payment Gayway Time Out Exception");
		}
		else {
			System.out.println("Time is still running");
		}
	}
	
	static void checkAddress(String address) throws AddressNotFoundException{
		if(address == null || address.isEmpty()) {
			throw new AddressNotFoundException("Check not found, exeption created");
		}
		else {
			System.out.println("Valid address");
		}
	}
	
	
	public static void main(String[] args){
		try {
			checkCoupon("half50");
			checkPaymentTime(80);
			checkAddress("Hyderabad");
			
			System.out.println("Order placed successfully");
		}
		catch(InvalidCouponException | PaymentGatewayTimeoutException | AddressNotFoundException e) {
			System.out.println(e.getMessage());
		}
//		catch(PaymentGatewayTimeoutException e) {
//			System.out.println(e.getMessage());
//		}
//		catch(AddressNotFoundException e) {
//			System.out.println(e.getMessage());
//		}
	}
}
