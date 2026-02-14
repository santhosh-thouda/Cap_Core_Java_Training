package EncapsulationPractice;

class PinChange{
	private int pin = 7576;
	
	public void setPin(int oldPin, int newPin) {
		if(this.pin == oldPin) {
			this.pin = newPin;
			System.out.println("Pin changed successfully");
		}
		else {
			System.out.println("Old pin is incorrect");
		}
	}
	
	public int getPin() {
		return pin;
	}
}

public class AtmMachine {
	public static void main(String[] args) {
		PinChange p = new PinChange();
		p.setPin(7576, 2929);
		System.out.println(p.getPin());
	}
}
