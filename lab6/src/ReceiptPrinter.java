package lab6;

import java.util.ArrayList;

public class ReceiptPrinter implements IPrinter {
	
	public ReceiptPrinter() {
	}
	public void printOrder(Order order) {
		StringBuilder builder = new StringBuilder();
		builder.append(
				"------------------------------------------\n" + 
				"|               FIVE GUYS                |\n" + 
				"|            BURGER AND FRIES            |\n" + 
				"|            STORE # CA-1294             |\n" + 
				"|         5353 ALMADEN EXPY N60          |\n" + 
				"|           SAN JOSE, CA 95118           |\n" + 
				"|            (P) 408-274-9300            |\n" + 
				"|                                        |\n" +
				"|                                        |\n");
		builder.append("|          " + order.getDate() + "           |\n");
		builder.append("|               FIVE GUYS                |\n" + 
				"|                                        |\n" +
				"|  Order Number: " + order.getOrderNumber() + "                      |\n");
		ArrayList<OrderLine> lines = order.getOrderLines();
		OrderLine line;
		for (int i = 0; i < lines.size(); i++) {
			line = lines.get(i);
			builder.append(String.format("|  %-4s%-28s%.2f  |\n", line.getCount(), line.getItem().getName(), line.getPrice()));
			ArrayList<String> toppings = line.getItem().getToppings();
			if (toppings != null) {
				for (int j = 0; j < toppings.size(); j ++) {
					builder.append(String.format("|      %-34s|\n", toppings.get(j)));
				}
			}
		}
		double tax = order.getPrice() * 0.09;
		double total = order.getPrice() + tax;
		builder.append("|                                        |\n");
		builder.append("|      Sub. Total:                $" + String.format("%-6.2f|\n", order.getPrice()));
		builder.append("|      Tax:                       $" + String.format("%-6.2f|\n", tax));
		builder.append("|      Total:                     $" + String.format("%-6.2f|\n", total));
		builder.append("|                                        |\n");
		builder.append("|      Cash                       $"  + String.format("%-6.2f|\n", order.getCash()));
		builder.append("|      Change                     $"  + String.format("%-6.2f|\n", order.getCash() - total));
		builder.append("|  Register: 1     Tran Seq No:" + String.format("%8s  |\n", order.getTranSeq()));
		builder.append("|  Cashier: Sakda* S.                    |\n" + 
				"|       **************************       |\n" + 
				"|  Don't throw away your receipt.        |\n" + 
				"|                                        |\n" + 
				"------------------------------------------");
		System.out.println(builder.toString());
	}
	
}
