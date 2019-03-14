package lab6;

public class Main {

	public static void main(String[] args) {
		Order order = new Order(45, 57845, "12/1/2016 1:46:54PM");
		Burger burger = new Burger("LBB", 5.59, 1);
		burger.addTopping("{{{{Bacon}}}}");
		burger.addTopping("LETTUCE");
		burger.addTopping("TOMATO");
		burger.addTopping("->|G ONION");
		burger.addTopping("->|JALA Grilled");
		order.addItem(1, burger);
		Fries fries = new Fries("LTL CAJ", 2.79);
		order.addItem(1, fries);
		order.makePayment(20);
		ReceiptPrinter rP = new ReceiptPrinter();
		order.setPrinter((IPrinter) rP);
		order.print();
		SlipPrinter sP = new SlipPrinter();
		order.setPrinter((IPrinter)sP);
		order.print();
	}

}
