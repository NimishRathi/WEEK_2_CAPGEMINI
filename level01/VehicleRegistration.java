package level01;

public class VehicleRegistration {
    String ownerName;
    String vehicleType;
    static double registrationFee = 100.0;

    // Constructor to initialize vehicle details
    public VehicleRegistration(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    // Instance method to display vehicle details
    public void displayVehicleDetails() {
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Registration Fee: $" + registrationFee);
    }

    // Class method to update the registration fee
    public static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
    }

    public static void main(String[] args) {
        // Creating vehicle instances
        VehicleRegistration vehicle1 = new VehicleRegistration("John Doe", "Car");
        VehicleRegistration vehicle2 = new VehicleRegistration("Jane Smith", "Motorcycle");

        // Displaying vehicle details before updating the registration fee
        vehicle1.displayVehicleDetails();
        vehicle2.displayVehicleDetails();

        // Updating the registration fee using the class method
        VehicleRegistration.updateRegistrationFee(120.0);

        // Displaying vehicle details after updating the registration fee
        vehicle1.displayVehicleDetails();
        vehicle2.displayVehicleDetails();
    }
}
