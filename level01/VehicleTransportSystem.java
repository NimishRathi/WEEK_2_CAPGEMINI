package level01;

//create class Vehicle
class Vehicle {
    int maxSpeed;
    String fuelType;

    //create constructor
    Vehicle(int maxSpeed, String fuelType) {
        this.maxSpeed = maxSpeed;
        this.fuelType = fuelType;
    }

    //create methode
    void display() {
        System.out.println("maxspeed " + maxSpeed + "fuelType " + fuelType);
    }
}

class Car extends Vehicle {
    int seatCapacity;

    Car(int maxSpeed, String fuelType, int seatCapacity) {
        super(maxSpeed, fuelType);
        this.seatCapacity = seatCapacity;
    }
@Override
    void display() {
        System.out.println("maxspeed " + maxSpeed + "fuelType " + fuelType + "seatCapacity " + seatCapacity);
    }
}

//create class Truck which extends Vehicle
class Truck extends Vehicle {
    int seatCapacity;

    //create constructor
    Truck(int maxSpeed, String fuelType, int seatCapacity) {
        super(maxSpeed, fuelType);
        this.seatCapacity = seatCapacity;
    }
@Override
    //create methode to display
    void display() {
        System.out.println("maxspeed " + maxSpeed + "fuelType " + fuelType + "seatCapacity " + seatCapacity);
    }
}

//create class Motorcycle extends class Vehicle
class Motorcycle extends Vehicle {
    int seatCapacity;

    //constructor
    Motorcycle(int maxSpeed, String fuelType, int seatCapacity) {
        super(maxSpeed, fuelType);
        this.seatCapacity = seatCapacity;
    }
@Override
    //create display methode
    void display() {
        System.out.println("maxspeed " + maxSpeed + "fuelType " + fuelType + "seatCapacity " + seatCapacity);
    }
}

public class VehicleTransportSystem {
    public static void main(String[] args) {
        //create object of each class\
        Vehicle objectArray[] = new Vehicle[3];
        objectArray[0] = new Car(120, " diseal ", 15);
        objectArray[1] = new Truck(80, " petrol ", 10);
        objectArray[2] = new Motorcycle(75, " petrol ", 14);

        objectArray[0].display();
        objectArray[1].display();
        objectArray[2].display();

    }
}
