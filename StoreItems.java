package shoppingcart;

import java.util.ArrayList;

public class StoreItems {
	public static void main(String[] args) {
		ArrayList<Item> items = new ArrayList<>();

		items.add(new Item("Apple", 66, 5));
		items.add(new Item("Banana", 59, 20));
		items.add(new Item("Orange", 29, 15));

		int total = sumPrices(items);
		printItemNames(items);

		System.out.println("Total price of items: Amount is " + total);

		purchaseItem(items, "Apple");
		purchaseItem(items, "Orange");
	}

	private static int sumPrices(ArrayList<Item> items) {
		int sum = 0;
		for (Item item : items) {
			sum += item.getPrice();

		}
		return sum;
	}

	private static void printItemNames(ArrayList<Item> items) {
		System.out.println("Items in the store:");
		for (Item item : items) {
			System.out.println(item.getName());
		}
	}

	private static void purchaseItem(ArrayList<Item> items, String itemName) {
		for (Item item : items) {
			if (item.getName().equals(itemName)) {
				item.purchaseItem();
				System.out.println("Purchased one " + itemName + ", Remaining quantity: " + item.getQuantity());
				return;
			}
		}
		System.out.println("Item " + itemName + " not found.");
	}
}
