package relationship1;

public class SmartPhone1 {
	private Sims1[] sim;
	
	private Sims1[] createSims() {
		if(sim == null) {
			sim = new Sims1[4];
			
			sim[0] = new Sims1();
			sim[0].setSim("Idea");
			
			sim[1] = new Sims1();
			sim[1].setSim("Jio");
			
			sim[2] = new Sims1();
			sim[2].setSim("Airtel");
			
			sim[3] = new Sims1();
			sim[3].setSim("BSNL");	
		}
		
		return sim;
	}
	
	public Sims1[] getSims() {
		return createSims();
	}
}
