package StreamPractice;

import java.util.*;

public class BillingSystemMain {
	public static void main(String[] args) {
		ArrayList<BillingSystem> plist = new ArrayList<>();
		plist.add(new BillingSystem(101, "Chocos", 190));
		plist.add(new BillingSystem(102, "Boost", 200));
		plist.add(new BillingSystem(103, "Horlicks", 210));
		plist.add(new BillingSystem(104, "Ensure", 300));
		plist.add(new BillingSystem(105, "Protinex", 312));
		plist.add(new BillingSystem(106, "Bru Coffee", 58));
		plist.add(new BillingSystem(107, "Bournvita", 174));
		
		double total = plist.stream()
			.map(p -> p.getPrice())
			.reduce(0.0, (a, b) -> a+b);
		
		System.out.println(total);
	}
}
