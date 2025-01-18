package level01;

public class CarRental {
    // Attributes
    String customerName;
    String carModel;
    int rentalDays;
    double dailyRate; // Assume a default daily rate for simplicity

    // Constructor to initialize rental details
    public CarRental(String customerName, String carModel, int rentalDays, double dailyRate) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
        this.dailyRate = dailyRate;
        }

    // Method to calculate the total cost
    public double calculateTotalCost() {
        return rentalDays * dailyRate;
    }
    // Method to display rental details
    public void displayRentalDetails() {
        System.out.println("Customer Name: " + customerName);
        System.out.println("Car Model: " + carModel);
        System.out.println("Rental Days: " + rentalDays);
        System.out.println("Total Rental Cost: $" + calculateTotalCost());
    }

    // Main method to test the class
    public static void main(String[] args) {
        // Create a CarRental object with sample data
        CarRental rental1 = new CarRental("John Doe", "Toyota Corolla", 5, 40.0);

        // Display rental details and total cost
        rental1.displayRentalDetails();
    }
}
