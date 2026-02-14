package StreamPractice;

//You have a list of scores.
//👉 Sort scores in descending order.

import java.util.*;

public class LeaderboardMain {
	public static void main(String[] args) {
		ArrayList<Leaderboard> slist = new ArrayList<>();
		
		slist.add(new Leaderboard(101, "Santhu", 98));
		slist.add(new Leaderboard(102, "Arjun", 91));
		slist.add(new Leaderboard(103, "Sanjana", 89));
		slist.add(new Leaderboard(104, "Harika", 94));
		slist.add(new Leaderboard(105, "YashKarle", 86));
		slist.add(new Leaderboard(106, "Munwar", 97));
		slist.add(new Leaderboard(107, "Chetan", 95));
		
		slist.stream()
			.sorted((a, b) -> Double.compare(b.getScore(), a.getScore()))
			.forEach(System.out::println);
	}
}
