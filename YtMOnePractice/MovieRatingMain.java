package YtMOnePractice;

public class MovieRatingMain {
	public static void main(String[] args) throws Exception {
		Rating rating = new Rating(9, 7);
		Validator1 v = new Validator1();
		
		String s = v.canBeConsideredForTheAward(rating);
		System.out.println(s);
			
		String t = v.sendInvite(rating);
		System.out.println(t);
		
		System.out.println(s.toLowerCase());
		System.out.println(t.toUpperCase());
	}
}
