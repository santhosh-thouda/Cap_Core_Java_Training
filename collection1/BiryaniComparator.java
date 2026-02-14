package collection1;

import java.util.*;

public class BiryaniComparator implements Comparator<Biryani>{
	public int compare(Biryani b1, Biryani b2) {
		return b1.id - b2.id;
	}
}
