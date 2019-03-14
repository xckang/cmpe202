package lab6;

public class OrderLine {
	
	private int count;
	private IOrderItem item;
	
	public OrderLine(int count, IOrderItem item) {
		this.count = count;
		this.item = item;
	}
	
	/**
	 * ordered count
	 * @return count
	 */
	public int getCount() {
		return this.count;
	}
	
	/**
	 * ordered item
	 * @return IOrderItem
	 */
	public IOrderItem getItem() {
		return this.item;
	}
	
	/**
	 * price
	 * @return price
	 */
	public double getPrice() {
		return this.count * this.item.getPrice();
	}
	
	/**
	 * count
	 * @return count
	 */
	public int getPattyCount() {
		return this.count * this.item.getPattyCount();
	}
}