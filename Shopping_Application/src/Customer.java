import java.util.ArrayList;

public class Customer {
	
	// Attributes
	private String name;
	private String address;
	ArrayList<Order> orders = new ArrayList<Order>();
	
	// Constructor
	public Customer(String name, String address) {
		this.name = name;
		this.address = address;
	}
	
	// Get methods
	public String get_name() {
		return this.name;
	}
	public String get_address() {
		return this.address;
	}
	
	// Set methods
	public void set_name(String name) {
		this.name = name;
	}
	public void set_address(String address) {
		this.address = address;
	}

	public void add_order(Order order) {
		
	}
	
}
