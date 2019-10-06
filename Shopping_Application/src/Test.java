import java.util.Scanner;
import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		
		// I instantiate a number of phones.
		Phone phone_1 = new Phone("Samsung", "Galaxy S7", 32, "minimal wear", 250.00);
		Phone phone_2 = new Phone("Apple", "Iphone XS Max", 256, "used", 1000.00);
		Phone phone_3 = new Phone("Huawei", "P20 Pro", 128, "well worn", 400.00);
		
		// I set the attributes for the first phone.
		phone_1.set_make("Google");
		phone_1.set_model("Pixel 3 XL");
		phone_1.set_storage_space(128);
		phone_1.set_description("slightly worn");
		phone_1.set_price(800.00);
		
		// I set the attributes for the second phone.
		phone_2.set_make("Sony");
		phone_2.set_model("Xperia XZ3");
		phone_2.set_storage_space(64);
		phone_2.set_description("factory new");
		phone_2.set_price(650.00);
		
		// I set the attributes for the third phone.
		phone_3.set_make("Samsung");
		phone_3.set_model("Galaxy Note 9");
		phone_3.set_storage_space(512);
		phone_3.set_description("used");
		phone_3.set_price(850.00);
		
		// I instantiate a number of TVs.
		TV tv_1 = new TV("LG", 65, "OLED", false, "factory new", 1400.00);
		TV tv_2 = new TV("Sharp", 90, "LED", true, "used", 4500.00);
		TV tv_3 = new TV("Pioneer", 50, "Plasma", false, "minimal wear", 2750.00);
		
		// I set the attributes for the first TV.
		tv_1.set_make("Sony");
		tv_1.set_screen_size(55);
		tv_1.set_type("LED");
		tv_1.set_three_dimensional(true);
		tv_1.set_description("used");
		tv_1.set_price(1100.00);
		
		// I set the attributes for the second TV.
		tv_2.set_make("Samsung");
		tv_2.set_screen_size(65);
		tv_2.set_type("QLED");
		tv_2.set_three_dimensional(false);
		tv_2.set_description("factory new");
		tv_2.set_price(3200.00);
		
		// I set the attributes for the third TV.
		tv_3.set_make("LG");
		tv_3.set_screen_size(40);
		tv_3.set_type("LCD");
		tv_3.set_three_dimensional(true);
		tv_3.set_description("slightly worn");
		tv_3.set_price(675.00);
		
		
		// I create some Customer objects.
		Customer customer_1 = new Customer("Tom", "6 Fairway Street, Knoxville");
		Customer customer_2 = new Customer("Jack", "22 Hartford Drive, Riverside");
		Customer customer_3 = new Customer("Olivia", "748 Creekside Lane, Ridgefield");
		
		// I create a new arraylist which will hold all customer objects with their details.
		ArrayList<Customer> customer_objects_holder = new ArrayList<Customer>();
		customer_objects_holder.add(customer_1);
		customer_objects_holder.add(customer_2);
		customer_objects_holder.add(customer_3);
		
		// I create a ProductDB object.
		ProductDB database = new ProductDB();
		
		// I add all my products to the ProductDB object.
		database.add(phone_1);
		database.add(phone_2);
		database.add(phone_3);
		database.add(tv_1);
		database.add(tv_2);
		database.add(tv_3);
		
		// I create some Order objects for given Customers.
		Order o1 = new Order();
		Order o2 = new Order();
		Order o3 = new Order();
		Order o4 = new Order();
		Order o5 = new Order();
		Order o6 = new Order();
		Order o7 = new Order();
		
		// I add the Orders with particular Products and their quantities.
		o1.add(phone_1, 2); 
		o2.add(phone_2, 6);
		o3.add(phone_3, 3);
		o4.add(tv_1, 1);
		o5.add(tv_2, 7);
		o6.add(tv_3, 5);
		
		// I add some orders to the Customer objects.
		customer_1.add_order(o2);
		customer_2.add_order(o3);
		customer_3.add_order(o5);
		
		// Application's functionality
		
		// I declare a choice variable to be of type int.
		int choice;
		// I create a new Scanner object and I assign it to the variable keyboard.
		Scanner keyboard_0 = new Scanner(System.in);
		
		// This do-while loop will execute at least once.
		do {
			// I provide a menu in the application.
			System.out.println();
			System.out.println("1. Create a new phone");
			System.out.println("2. Create a new customer");
			System.out.println("3. Search for a product by supplying the productID"); 
			System.out.println("4. Display all products in the database");
			System.out.println("5. Order some products");
			System.out.println("6. Display all orders and products that are in a given order");
			System.out.println("7. Display all orders for a given product by supplying the productID");
			System.out.println("8. Quit");
			System.out.println();
			System.out.print("Please enter a number [1 to 8] >>>");
			
			// If the user will accidentally enter an incorrect input, I will give him/her a chance to try again. This while loop will ensure that a number is entered.
			while (!keyboard_0.hasNextInt()) {
				System.out.println("That is not a correct choice!");
		        System.out.print("Please enter a number [1 to 8] >>>");
		        keyboard_0.next();
		    }
			
			// The choice (number) will be passed as an integer to the switch statement.
			choice = keyboard_0.nextInt();
			System.out.println();
			switch(choice) {
				// Create a new phone.
				case 1:
					// I am going to ask a user about some phone's details.
					System.out.println("You chose the 1st option!");
					// I create a new arraylist which will hold the current phone object with its details.
					ArrayList<Phone> phone_objects_holder = new ArrayList<Phone>();
					// I create a new reference to the Scanner object and I assign it to the variable keyboard_1.
					Scanner keyboard_1 = new Scanner(System.in);
					
					System.out.print("Enter the phone's make: ");
					String phone_make = keyboard_1.nextLine();
					
					System.out.print("Enter the phone's model: ");
					String phone_model = keyboard_1.nextLine();
					
					System.out.print("Enter the phone's storage space: ");
					int phone_storage_space = keyboard_1.nextInt();
					keyboard_1.nextLine();
					
					System.out.print("Enter the phone's description: ");
					String phone_description = keyboard_1.nextLine();
					
					System.out.print("Enter the phone's price: ");
					double phone_price = keyboard_1.nextDouble();
					
					// I add some of the phone's details to the holder of the current object.
					phone_objects_holder.add(new Phone(phone_make, phone_model, phone_storage_space, phone_description, phone_price));
					// I add the current phone object to the global database.
					database.add(phone_objects_holder.get(0));

					break;
					
				// Create a new customer.	
				case 2:
					// I am going to ask a user about his/her (customer) details.
					System.out.println("You chose the 2nd option!");
					
					// I create a new reference to the Scanner object and I assign it to the variable keyboard_2.
					Scanner keyboard_2 = new Scanner(System.in);
					
					System.out.print("Enter the customer's name: ");
					String new_customer_name = keyboard_2.nextLine();
					
					System.out.print("Enter the customer's address: ");
					String customer_address = keyboard_2.nextLine();
					
					// I add the customer's details to the holder of the current object.
					customer_objects_holder.add(new Customer(new_customer_name, customer_address));
					
					break;
				
				// Search for a product by supplying the productID.	
				case 3:
					// I am going to ask a user about the productID.
					System.out.println("You chose the 3rd option!");
					// I create a new reference to the Scanner object and I assign it to the variable keyboard_3.
					Scanner keyboard_3 = new Scanner(System.in);
					System.out.print("Enter the productID >>>");
					int productID = keyboard_3.nextInt();
					// I look for a product in the database with a particular ID.
					Product searched_product = database.find(productID);
					// If there is no match, I do the following:
					if (searched_product == null) {
						// I display a message telling a user that the system did not find the productID which a product is assigned to.
						System.out.println("I'm sorry, but the system could not find the product you are looking for.");
					}
					// Otherwise, I do the following:
					else {
						// I print the information about the product which the productID is assigned to.
						searched_product.print();
					}
					
					break;
					
				// Display all products in the database.	
				case 4: 
					System.out.println("You chose the 4th option!");
					// I invoke the function that displays all the products which are currently in the database.
					database.display_all_products();
					
					break;
				
				// Allow a customer to order some products.
				case 5:
					System.out.println("You chose the 5th option!");
					// I create a new reference to the Scanner object and I assign it to the variable keyboard_5.
					Scanner keyboard_5 = new Scanner(System.in);
					System.out.print("Enter the customer's name: ");
					String customer_name_1 = keyboard_5.nextLine();
					int customer_index = 0;
					while (customer_index < customer_objects_holder.size()) {
						customer_objects_holder.get(customer_index).get_name();
						if (customer_objects_holder.get(customer_index).get_name().equals(customer_name_1)) {
							database.display_all_products();
							
							Scanner product_ID_input = new Scanner(System.in);
							System.out.print("Enter the productID of the product you would like to order >>>");
							int productID_order = product_ID_input.nextInt();
							
							Scanner product_quantity_input = new Scanner(System.in);
							System.out.print("Enter the quantity >>>");
							int quantity_order = product_quantity_input.nextInt();
							
							break;
						}
						
						if (customer_index == customer_objects_holder.size() - 1 && (!customer_objects_holder.get(customer_index).get_name().equals(customer_name_1))) {
							System.out.println("I'm sorry, but the system could not find the customer with this name.");
						}
						
						customer_index++;
					}
					
					break;
					
				case 6:
					System.out.println("You chose the 6th option!");
					break;
					
				case 7:
					System.out.println("You chose the 7th option!");
					break;
					
				// Quit
				case 8:
					// I display a warm farewell to the user.
					System.out.println("Thank you for using my program, goodbye!");
					break;
			}
		}
		
		// As long as the choice (number entered) is not equal to 8, the program will keep running.
		while (choice != 8);
		
		// I close the Scanner object assigned to the variable keyboard.
		keyboard_0.close();
		
	}
		
}
