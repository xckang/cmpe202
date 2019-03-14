package lab6;

import java.util.ArrayList;

public class Order {
	
	private int orderNum;
	private int tranSeq;
	private String date;
	private double cash;
	private ArrayList<OrderLine> lines;
	IPrinter printer;
	
	public Order(int num, int tranSeq, String date) {
		this.orderNum = num;
		this.tranSeq = tranSeq;
		this.date = date;
		lines = new ArrayList<OrderLine>();
	}
	
	public int getOrderNumber() {
		return this.orderNum;
	}
	
	public int getTranSeq() {
		return this.tranSeq;
	}
	
	public String getDate() {
		return this.date;
	}
	
	public double getCash() {
		return this.cash;
	}
	
	public ArrayList<OrderLine> getOrderLines() {
		return this.lines;
	}
	/**
	 * add an order line
	 * @param count count of ordered item
	 * @param item ordered item
	 */
	public void addItem(int count, IOrderItem item) {
		OrderLine line = new OrderLine(count, item);
		lines.add(line);
	}
	
	/**
	 * payment
	 * @param cash payment amount
	 */
	public void makePayment(float cash) {
		this.cash = cash;
	}
	
	/**
	 * price for the whole order without tax
	 * @return order price
	 */
	public double getPrice() {
		OrderLine line;
		double price = 0;
		for (int i = 0; i < lines.size(); i ++ ) {
			line = lines.get(i);
			price += line.getPrice();
		}
		return price;
	}
	
	/**
	 * total count of patties
	 * @return count
	 */
	public int getPattyCount() {
		OrderLine line;
		int count = 0;
		for (int i = 0; i < lines.size(); i ++ ) {
			line = lines.get(i);
			count += line.getPattyCount();
		}
		return count;
	}
	
	public void setPrinter(IPrinter p) {
		this.printer = p;
	}
	public void print() {
		printer.printOrder(this);
	}
}
