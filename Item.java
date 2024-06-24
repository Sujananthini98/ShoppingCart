package shoppingcart;

public class Item {
	private String name;
	private int price;
	private int quantity;

	public Item(String name, int price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;

	}

	public int getPrice() {
		return price;
	}

	public String getName() {
		return name;
	}

	public int getQuantity() {
		return quantity;
	}

	public void purchaseItem() {
		if (quantity > 0) {
			quantity--;
		} else {
			System.out.println("Item " + name + " is out of stock.");
		}
	}

	@Override
	public String toString() {
		return "Item [name=" + name + ", price=" + price + ", quantity=" + quantity + "]";
	}

	
}
