package YtMOnePractice;

class CarSpeed{
	String speed;
}

class CarSpeedImplementation{
	public String setCarSpeed(CarSpeed sp, int spd) throws SpeedInvalidException{
		try {
			if(spd < 30 || spd < 90) {
				throw new SpeedInvalidException("Exception in Speed Vaidation");
			}
			else {
				sp.speed = "Valid";
			}
		}
		catch(SpeedInvalidException e) {
			sp.speed = e.getMessage();
		}
		return sp.speed;
	} 
}

class SpeedInvalidException extends Exception{
	SpeedInvalidException(String msg){
		super(msg);
	}
}

public class CarSpeedDriver {
	public static void main(String[] args) {
		CarSpeed s = new CarSpeed();
		CarSpeedImplementation si = new CarSpeedImplementation();
		
		try {
			System.out.println(si.setCarSpeed(s, 25));
		}
		catch(SpeedInvalidException e) {
			e.printStackTrace();
		}
	}
}
