package aims;

public class Cart {
	public static final int MAX_NUMBERS_ORDERED = 20;
	private DigitalVideoDisc itemsOrdered[] = 
			new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
	    public double totalCost() {
	        double total = 0.0;  // Initialize total cost to zero
	        for (DigitalVideoDisc disc : itemsOrdered) {
	            if (disc != null) {  // Check if disc is not null
	                total += disc.getCost();  // Add the cost of the disc to total
	            }
	        }
	        return total;  // Return the total cost of all discs
	    }
	    
	    
	    
	    
	    
	        private int quantity = 0;  // Current number of items in the cart

	        // Method to add a disc to the order
	        public boolean addDigitalVideoDisc(DigitalVideoDisc disc) {
	            if (quantity >= MAX_NUMBERS_ORDERED) {  // Check if the cart is already full
	                System.out.println("The cart is already full. Cannot add more items.");
	                return false;  // Indicate that the disc couldn't be added
	            }
	            itemsOrdered[quantity] = disc;  // Add the disc to the next available slot
	            quantity++;  // Increment the quantity
	            System.out.println("The disc has been added to the cart.");
	            return true;  // Indicate successful addition
	        }

	        // Method to remove a disc from the order
	        public boolean removeDigitalVideoDisc(DigitalVideoDisc disc) {
	            for (int i = 0; i < quantity; i++) {
	                if (itemsOrdered[i] == disc) {  // Find the matching disc
	                    // Shift all items after the removed disc to the left
	                    for (int j = i; j < quantity - 1; j++) {
	                        itemsOrdered[j] = itemsOrdered[j + 1];
	                    }
	                    itemsOrdered[quantity - 1] = null;  // Remove the last duplicate after shift
	                    quantity--;  // Decrement the quantity
	                    System.out.println("The disc has been removed from the cart.");
	                    return true;  // Indicate successful removal
	                }
	            }
	            System.out.println("The disc is not in the cart.");
	            return false;  // Indicate that the disc wasn't found
	        }
	    }

	


