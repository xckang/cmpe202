package lab6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SlipPrinter implements IPrinter {

	public SlipPrinter() {	
	}
	
	public void printOrder(Order order) {
		StringBuilder builder = new StringBuilder();
		builder.append("------------------------------------------\n");
		builder.append(String.format("|  Patties - %-28s|\n", order.getPattyCount()));
		builder.append("|                                        |\n");
		builder.append("|                                        |\n");
		builder.append(String.format("|  Order Number: %-24s|\n", order.getOrderNumber()));
		builder.append("|          " + order.getDate() + "           |\n");
		builder.append("|               FIVE GUYS                |\n");
		builder.append("|                                        |\n");
		builder.append("|  Sandwich#                             |\n");
		ArrayList<OrderLine> lines = order.getOrderLines();
		OrderLine line;
		for (int i = 0; i < lines.size(); i++) {
			line = lines.get(i);
			builder.append(String.format("|  %-4s%-34s|\n", line.getCount(), line.getItem().getName()));
			ArrayList<String> toppings = line.getItem().getToppings();
			if (toppings != null) {
				Collections.sort(toppings, new Comparator<String>() {
					@Override
					public int compare(String s1, String s2) {
						if (s1.startsWith("->") && !s2.startsWith("{{{{") && !s2.startsWith("->")) {
							return 1;
						} else if (s2.startsWith("->") && !s1.startsWith("{{{{") && !s1.startsWith("->")) {
							return 0;
						} else {
							return s1.compareTo(s2);
						}
					}
				});
				for (int j = 0; j < toppings.size(); j ++) {
					builder.append(String.format("|      %-34s|\n", toppings.get(j)));
				}
			}
		}
		builder.append("|  Register: 1     Tran Seq No:   57845  |\n");
		builder.append("|  Cashier: Sakda* S.                    |\n");
		builder.append("------------------------------------------");
		System.out.println(builder.toString());
	}
	
}
