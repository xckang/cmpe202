package lab6;

import java.util.ArrayList;

public interface IOrderItem {
	// price for the item in order
	public double getPrice();
	// description for the item in order
	public ArrayList<String> getToppings();
	// name for the item
	public String getName();
	// patty count
	public int getPattyCount();
}
