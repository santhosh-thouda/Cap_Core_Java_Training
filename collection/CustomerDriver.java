package collection;

import java.util.Vector;

class Customer{
	int cid;
	String cname;
	
	Customer(int cid, String cname){
		this.cid = cid;
		this.cname = cname;
	}
	
	Customer(){};
	
	public void setCustomerId(int cid) {
		this.cid = cid;
	}
	
	public int getCustomerId() {
		return cid;
	}
	
	public void setCustomerName(String cname) {
		this.cname = cname;
	}
	
	public String getCustomerName() {
		return cname;
	}
	
	
	public String toString() {
		return "Cid : " +cid+ " , Cname : "+cname;
	}
}

class CustomerUtil{
	Vector <Customer> vc = new Vector<>();
	
	public void addCustomer(Customer c) {
		vc.add(c);
	}
	
	public Customer getCustomerById(int cid) {
		for(Customer c : vc) {
			if(c.getCustomerId() == cid) {
				return c;
			}
		}
		return null;
	}
	
	public void deleteCustomerById(int cid) {
		for(Customer c : vc) {
			if(c.getCustomerId() == cid) {
				vc.remove(c);
			}
		}
	}
	
	public void displayCustomers() {
		for(Customer c : vc) {
			System.out.println(c.toString());
		}
	}
}

public class CustomerDriver {
	public static void main(String[] args) {
		CustomerUtil cu = new CustomerUtil();
		
		cu.addCustomer(new Customer(101, "Santhosh"));
		cu.addCustomer(new Customer(102, "Sanjana"));
		cu.addCustomer(new Customer(103, "Arjun"));
		cu.addCustomer(new Customer(104, "YashKarle"));
		
		int idToDelete = 103;
		
		if(idToDelete > 0) {
			cu.deleteCustomerById(idToDelete);
		}
		
		cu.displayCustomers();
	}
}
