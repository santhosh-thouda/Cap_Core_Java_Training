package Encapsulation;

class PhoneVolume1{
	private int volume = 20;
	
	public int getVolume() {
		return volume;
	}
	
	public void setVolume(int volume) {
		if(volume > 0 && volume < 100) {
			this.volume = volume;
		}
	}
}

public class PhoneVolume {
	public static void main(String[]args) {
		PhoneVolume1 p = new PhoneVolume1();
		System.out.println(p.getVolume());
		p.setVolume(80);
		System.out.println(p.getVolume());
		p.setVolume(1200);
		System.out.println(p.getVolume());
	}
}
