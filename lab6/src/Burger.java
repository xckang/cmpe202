package lab6;

import java.util.ArrayList;

public class Burger implements IOrderItem {
	
	private String name;
	private double price;
	private int count;
	private ArrayList<String> toppings;
	
	public Burger(String name, double d, int count) {
		this.name = name;
		this.price = d;
		this.count = count;
		toppings = new ArrayList<String>();
	}
	// price for the item in order
	public double getPrice() {
		return price;
	}
	// toppings for the item in order
	public ArrayList<String> getToppings() {
		return toppings;
	}
	// name for the item
	public String getName() {
		return this.name;
	}
	// patty count
	public int getPattyCount() {
		return this.count;
	}
	
	// add topping to burger
	public void addTopping(String topping) {
		toppings.add(topping);
	}
}
