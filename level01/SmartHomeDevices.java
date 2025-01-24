package level01;
//create class Device
class Device {
    int deviceId;
    String Status;
//constructor
    Device(int deviceId, String Status) {
        this.deviceId = deviceId;
        this.Status = Status;
    }
    void display(){
        System.out.println(" device ID " + deviceId + " Status " + Status);
    }
}
//new class thermostat extends Device class
class Thermostat extends Device {
    double TemperatureSetting;
//constructor
    Thermostat(int deviceId, String Status, double TemperatureSetting) {
        //calling Device class constructor using super keyword
        super(deviceId, Status);
        this.TemperatureSetting = TemperatureSetting;
    }
@Override
    void display() {
        //calling super class display methode
        super.display();
        System.out.println(" TemperatureSetting " + TemperatureSetting);
    }
}


public class SmartHomeDevices {
    public static void main(String[] args) {
        Thermostat thermostat = new Thermostat(4564, "active  ", 14);
        thermostat.display();
    }
}
