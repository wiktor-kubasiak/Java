import java.util.ArrayList;

public class Order {
	
	// Attribute
	ArrayList<Product> products = new ArrayList<Product>();
	ArrayList<Integer> quantity_of_products = new ArrayList<Integer>();

	public void add(Product product_to_be_purchased, int quantity_to_be_purchased) {
		this.products.add(product_to_be_purchased);
		this.quantity_of_products.add(quantity_to_be_purchased);
	}
	
}
