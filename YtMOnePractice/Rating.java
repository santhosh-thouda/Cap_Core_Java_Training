package YtMOnePractice;

public class Rating {
	int imdbRating;
	int nominee;
	
	Rating(int imdbRating, int nominee){
		this.imdbRating = imdbRating;
		this.nominee = nominee;
	}
	
	int getImdbRating() {
		return imdbRating;
	}
	
	int getNominee() {
		return nominee;
	}
}