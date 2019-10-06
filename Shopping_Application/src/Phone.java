public class Phone extends Product {

	// Attributes
	private String make;
	private String model;
	private int storage_space;
	
	// Constructor
	public Phone(String make, String model, int storage_space, String description, double price) {
		super(make, description, price);
		this.model = model;
		this.storage_space = storage_space;
	}

	// Get methods
	public String get_make() {
		return this.make;
	}
	public String get_model() {
		return this.model;
	}
	public int get_storage_space() {
		return this.storage_space;
	}
	
	// Set methods
	public void set_make(String make) {
		this.make = make;
	}
	public void set_model(String model) {
		this.model = model;
	}
	public void set_storage_space(int storage_space) {
		this.storage_space = storage_space;
	}
	
	// Print method from the superclass
	public String print() {
		String phone_information = super.print() + "\nThe model of this phone is " + model + 
								   " and it has got " + storage_space + " gigabytes of storage space.";
								   
		System.out.println(phone_information);
		System.out.println();
		
		return phone_information;
	}
	
}
