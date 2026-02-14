package YtMOnePractice;

import java.util.*;

public class SourceMain {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		list.add("m");
		
		Source s = new Source();
		System.out.println(s.changeOccurence(list, "c", "t"));
		System.out.println(s.listIndex(list));
		System.out.println(s.listAfter(list, "c", "t"));
	}
}
