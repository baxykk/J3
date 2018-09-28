package ua.univer.io;

public class Invoice {

	int id;
	int number;
	int item_id;
	int quantity;
	
	public Invoice(int id, int number, int item, int quantity) {
		this.id = id;
		this.number = number;
		this.item_id = item;
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "Invoice [id=" + id + ", number=" + number + ", item=" + item_id + ", quantity=" + quantity + "]";
	}

	
}
