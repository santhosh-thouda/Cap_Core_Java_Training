package Array;

public class CricketBestScore {
	public static void main(String[]args) {
		int[] scores = {198, 287, 288, 171, 190, 184, 199, 205};
		int bestScore = scores[0];
		for(int i = 1; i<scores.length; i++) {
			if(scores[i] > bestScore) {
				bestScore = scores[i];
			}
		}
		System.out.println(bestScore);
	}
}
