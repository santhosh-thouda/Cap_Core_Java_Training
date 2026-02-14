package Loops;

public class TemperatureMachine {
	public static void main(String[]args) {
		int temperature = 0;
		while(temperature <= 100) {
			System.out.println(temperature+ " : Safe Limit");
			temperature++;
		}
        System.out.println("Temperature crossed 100. System Stopped.");
	}
}
