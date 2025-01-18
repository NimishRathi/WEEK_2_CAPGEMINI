package level01;

public class BookBorrow {
    // Attributes of the Book class
    private String title;
    private String author;
    private double price;
    private boolean isAvailable; // Availability status: true means available, false means borrowed

    // Constructor to initialize the book attributes
    public BookBorrow(String title, String author, double price, boolean isAvailable) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.isAvailable = isAvailable;
    }

    // Method to borrow the book
    public boolean borrowBook() {
        if (isAvailable) {
            isAvailable = false;  // Mark the book as borrowed
            System.out.println("You have successfully borrowed the book: " + title);
            return true; // Return true indicating the book was successfully borrowed
        } else {
            System.out.println("Sorry, the book '" + title + "' is currently unavailable.");
            return false; // Return false indicating the book was not available
        }
    }
    // Method to display book information
    public void displayInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: $" + price);
        System.out.println("Available: " + (isAvailable ? "Yes" : "No"));
    }

    // Main method to test the Library Book System
    public static void main(String[] args) {
        // Create some book objects
        BookBorrow book1 = new BookBorrow("To Kill a Mockingbird", "Harper Lee", 15.99, true);
        BookBorrow book2 = new BookBorrow("1984", "George Orwell", 12.99, true);
        BookBorrow book3 = new BookBorrow("The Great Gatsby", "F. Scott Fitzgerald", 10.99, false); // Already borrowed

        // Display book details
        book1.displayInfo();
        book2.displayInfo();
        book3.displayInfo();

        // Try to borrow a book
        System.out.println("\nAttempting to borrow '1984'...");
        book2.borrowBook();  // Should succeed as it is available

        // Try to borrow a book that is unavailable
        System.out.println("\nAttempting to borrow 'The Great Gatsby'...");
        book3.borrowBook();  // Should fail as it is unavailable

        // Try to borrow a book that was previously borrowed
        System.out.println("\nAttempting to borrow 'To Kill a Mockingbird'...");
        book1.borrowBook();

        // Display updated availability of books
        System.out.println("\nUpdated Book Information:");
        book1.displayInfo();
        book2.displayInfo();
        book3.displayInfo();
    }
}
