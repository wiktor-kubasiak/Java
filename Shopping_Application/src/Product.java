import java.util.ArrayList;
import java.util.Random;

public class Product {
	
	// Attributes
	private String name;
	private String description;
	private double price;
	private int productID;
	// I create an arraylist of type Integer, which will hold the unique productID.
	static ArrayList<Integer> unique_productID = new ArrayList<Integer>();
	
	// Constructor
	public Product(String name, String description, double price) {
		this.name = name;
		this.description = description;
		this.price = price;
		// I create a new Random object and I assign it to the random_ID variable.
		Random random_ID = new Random();
		// I generate a unique productID in the range (0-30).
		this.productID = random_ID.nextInt(30) + 1;
		// If the unique productID does not contain any number or it does not match already existing productID, I do the following:
		if (unique_productID.isEmpty() || !(unique_productID.contains(this.productID))) {
			// I add the unique productID which will be assigned to a product.
			unique_productID.add(productID);
		}
	}
	
	// Get methods
	public String get_name() {
		return this.name;
	}
	public String get_description() {
		return this.description;
	}
	public double get_price() {
		return this.price;
	}
	public int get_productID() {
		return this.productID;
	}
	
	// Set methods
	public void set_name(String name) {
		this.name = name;
	}
	public void set_description(String description) {
		this.description = description;
	}
	public void set_price(double price) {
		this.price = price;
	}
	public void set_productID(int productID) {
		// If the unique productID already matches the existing productID, I do the following:
		if (unique_productID.contains(productID)) {
			// I display an appropriate message.
			System.out.println("This productID is already in use!");
		}
		// Otherwise, I consider the following:
		else {
			// I find the index of the ID being considered and I assign it to the variable.
			int previous_ID = unique_productID.indexOf(productID);
			// I remove it from the current position.
			unique_productID.remove(previous_ID);
			// I add a new productID and it will replace the previous productID.
			unique_productID.add(productID);
			// I confirm that this is a new unique productID.
			this.productID = productID;
		}
	}
	
	// Print method
	public String print() {
		String product_information = "The product is " + name + " which is " + description +
									 " with a price of €" + price + " and ID = " + productID + ".";
		
		return product_information;
	}
}
