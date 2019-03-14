package lab6;

import java.util.ArrayList;

public class Fries implements IOrderItem {
	
	private String name;
	private double price;
	
	public Fries(String name, double d) {
		this.name = name;
		this.price = d;
	}
	// price for the item in order
	public double getPrice() {
		return price;
	}
	// toppings for the item in order
	public ArrayList<String> getToppings() {
		return null;
	}
	// name for the item
	public String getName() {
		return this.name;
	}
	
	// patty count
	public int getPattyCount() {
		return 0;
	}
	
}
