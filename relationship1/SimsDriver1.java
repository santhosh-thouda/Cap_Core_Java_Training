package relationship1;

public class SimsDriver1 {
	public static void main(String[] args) {
		SmartPhone1 sm = new SmartPhone1();
		Sims1[] si = sm.getSims();
		
		for(int i = 0; i<si.length; i++) {
			System.out.println(si[i].getSim());
		}
	}
}
