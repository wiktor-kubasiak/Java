import java.util.ArrayList;

public class ProductDB {
	
	// Attribute
	ArrayList<Product> products = new ArrayList<Product>();
	
	// I can add a product.
	public void add(Product product) {
		this.products.add(product);
	}
	
	// I can remove a product.
	public void remove(Product product) {
		this.products.remove(product);
	}
	
	// I can find a product by searching its ID.
	public Product find(int productID_checked) {
		// I assign the product to null at the start.
		Product matched_product = null;
		// I assign the index_1 to be equal to 0.
		int index_1 = 0;
		// As long as the index does not reach all the products in the list, I consider the following:
		while (index_1 < products.size()) {
			// I look for the product's index and I assign it to the match variable.
			Product match = this.products.get(index_1);
			// If the productID being checked equals to the one I look for, I do the following:
			if (match.get_productID() == productID_checked) {
				// I assign it to he product which will be returned.
				matched_product = match;
				break;
			}
			
			// I increment the index_1 by 1 with each iteration.
			index_1++;
		}
		
		// I return a product with a matching productID.
		return matched_product;
	}
	
	// I can display all the products which are currently in the database.
	public void display_all_products() {
		// I assign the index_2 to be equal to 0.
		int index_2 = 0;
		while (index_2 < products.size()) {
			// Using the index I get all the pieces of information about the products in the database. 
			Product display_information = products.get(index_2);
			// At this line I print all the product information.
			display_information.print();
			// I separate the contents with a new line.
			System.out.println();
			
			// I increment the index_2 by 1 with each iteration.
			index_2++;
		}
	}
}
