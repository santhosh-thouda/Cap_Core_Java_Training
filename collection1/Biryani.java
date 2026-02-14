package collection1;

import java.util.*;

public class Biryani {
	int id;
	String name;
	int price;
	String type;
	
	public Biryani(int id, String name, int price, String type) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.type = type;
	}
	
	@Override
    public String toString() {
        return id + " | " + name + " | " + price + " | " + type;
    }
}
