package collection1;

import java.util.*;

public class BiryaniComparator1 implements Comparator<Biryani>{
	public int compare(Biryani b1, Biryani b2) {
		return b1.price - b2.price;
	}
}
