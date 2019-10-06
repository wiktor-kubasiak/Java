public class TV extends Product {
	
	// Attributes
	private String make;
	private int screen_size;
	private String type;
	private boolean three_dimensional;
	
	// Constructor
	public TV(String make, int screen_size, String type, boolean three_dimensional, String description, double price) {
		super(make, description, price);
		this.screen_size = screen_size;
		this.type = type;
		this.three_dimensional = three_dimensional;
	}

	// Get methods
	public String get_make() {
		return this.make;
	}
	public int get_screen_size() {
		return this.screen_size;
	}
	public String get_type() {
		return this.type;
	}
	public boolean get_three_dimensional() {
		return this.three_dimensional;
	}
	
	// Set methods
	public void set_make(String make) {
		this.make = make;
	}
	public void set_screen_size(int screen_size) {
		this.screen_size = screen_size;
	}
	public void set_type(String type) {
		this.type = type;
	}
	public void set_three_dimensional(boolean three_dimensional) {
		this.three_dimensional = three_dimensional;
	}
	
	// Print method from the superclass
	public String print() {
		String tv_information = super.print() + "\nThe size of this tv is " + screen_size + " inches with a " +
								type + " type." + " Does it have 3D capability: " + three_dimensional;
								
		
		System.out.println(tv_information);
		System.out.println();
		
		return tv_information;
	}
	
}
