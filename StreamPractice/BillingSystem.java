package StreamPractice;

//📌 Scenario: Billing System
//
//You have a list of order amounts.
//👉 Calculate total bill amount.

public class BillingSystem {
	private int pid;
	private String pname;
	private double price;
	
	BillingSystem(int pid, String pname, double price){
		this.setPid(pid);
		this.setPname(pname);
		this.setPrice(price);
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
}
