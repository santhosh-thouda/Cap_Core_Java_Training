package ExceptionHandlingPractice1;

class TemperatureOutOfRangeException extends Throwable{
	TemperatureOutOfRangeException(String msg){
		super(msg);
	}
}

public class TemperatureSensor {
	static void checkTemperature(int temp) throws TemperatureOutOfRangeException{
		if(temp < -50 || temp > 100) {
			throw new TemperatureOutOfRangeException("Temperature Exceeded");
		}
		else {
			System.out.println("Temperature: " +temp);
		}
	}
	
	public static void main(String[] args) {
		try {
			checkTemperature(105);
		}
		catch(TemperatureOutOfRangeException e) {
			System.out.println(e.getMessage());
		}
	}
}
