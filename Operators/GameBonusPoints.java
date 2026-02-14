package Operators;

public class GameBonusPoints {
	public static void main(String[]args) {
		int score = 120;
		boolean completed = true;
		boolean cheated = false;
		
		score += (score > 100 && completed && !cheated) ? 50 : 0;
		System.out.println(score);
	}
}
