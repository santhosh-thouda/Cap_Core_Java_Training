package collection;

import java.util.*;
import java.lang.*;

class Chocolate implements Comparable<Chocolate>{
	private int cid;
	private String cname;
	private int cprice;
	
	public Chocolate(int cid, String cname, int cprice) {
		this.cid = cid;
		this.cname = cname;
		this.cprice = cprice;
	}
	
	@Override
	public int compareTo(Chocolate c) {
		return this.cprice - c.cprice;
	}
	
	public void setChocolateId(int cid) {
		this.cid = cid;
	}

	public int getChocolateId() {
		return cid;
	}

	public void setChocolateName(String cname) {
		this.cname = cname;
	}

	public String getChocolateName() {
		return cname;
	}

	public void setChocolatePrice(int cprice) {
		this.cprice = cprice;
	}

	public int getChocolatePrice() {
		return cprice;
	}
	
	public String toString() {
		return "Cid: "+cid+", Cname: "+cname+", Cprice: "+cprice;
	}
}

class ChocolateUtil{
	ArrayList<Chocolate> ca = new ArrayList<>();
	
	void displayChocolates() {
		ListIterator<Chocolate> li = ca.listIterator();
		while(li.hasNext()) {
			System.out.println(li.next().toString());
		}
	}
	
	void addChocolate(Chocolate c) {
		ca.add(c);
	}
	
	void deleteChocolateById(int cid) {
		ListIterator<Chocolate> li1 = ca.listIterator();
		
		while(li1.hasNext()) {
			if(li1.next().getChocolateId() == cid) {
				li1.remove();
			}
		}
	}
}

public class ChocolateDriver {
	public static void main(String[] args) {
		ChocolateUtil cu = new ChocolateUtil();
		cu.addChocolate(new Chocolate(101, "Diary Milk", 120));
		cu.addChocolate(new Chocolate(102, "5 star", 20));
		cu.addChocolate(new Chocolate(103, "Fuse", 30));
		cu.addChocolate(new Chocolate(104, "Snickers", 10));
		cu.addChocolate(new Chocolate(105, "Beast choco", 210));
		
//		cu.displayChocolates();
		cu.deleteChocolateById(103);
		Collections.sort(cu.ca);
		cu.displayChocolates();
	}
}
