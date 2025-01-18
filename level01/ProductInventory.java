package level01;

public class ProductInventory {
    // Instance Variables
     String productName;
     double price;

    // Class Variable
    private static int totalProducts = 0;

    // Constructor to initialize product details
    public ProductInventory(String productName, double price) {
        this.productName = productName;
        this.price = price;
        totalProducts++;  // Increment totalProducts each time a product is created
    }

    // Instance method to display product details
    public void displayProductDetails() {
        System.out.println("Product Name: " + productName);
        System.out.println("Price: " + price);
    }

    // Class method to display total number of products created
    public static void displayTotalProducts() {
        System.out.println("Total Products Created: " + totalProducts);
    }

    // Main method to test the class
    public static void main(String[] args) {
        // Create product objects
        ProductInventory product1 = new ProductInventory("Laptop", 899.99);
        ProductInventory product2 = new ProductInventory("Smartphone", 499.49);
        ProductInventory product3 = new ProductInventory("Headphones", 79.99);

        // Display individual product details
        product1.displayProductDetails();
        System.out.println();
        product2.displayProductDetails();
        System.out.println();
        product3.displayProductDetails();
        System.out.println();

        // Display the total number of products created
        ProductInventory.displayTotalProducts();
    }
}

