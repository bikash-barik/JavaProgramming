interface ElectricalParts{
    public void startUp();
    public void shutOff();
}

interface MechanicalParts{
    public double getSpeed();
    public void setSpeed(double spd);
}

class Vehicle implements ElectricalParts, MechanicalParts{
    // Instance fields (some omitted for brevity)
    // private members only accessible to the class, and subclass
    private boolean isOn;
    private double speed;
    private String VID;
    
    private static String vin = "VIN";
    private static byte vehicleCount = 0;
    // Instance methods (some omitted for brevity)
    public Vehicle() {// Constructor
        isOn = false;
        speed = 0.0;        
        // Assign vehicle number
        vehicleCount++;
        VID = vin + vehicleCount;
    }
    
    public Vehicle(boolean onOff, double spd) {// parameterized Constructor
        //isOn = onOff;
        if (onOff == true){
            startUp();
        }
        //speed = spd;        
        setSpeed(spd);
        // Assign vehicle number
        vehicleCount++;
        VID = vin + vehicleCount;
    }

    public void startUp() {
        if (isOn == false){
            isOn = true;
            System.out.println("Vehicle is switched on");
        }else{
            System.out.println("Vehicle is already switched on");
        }
    }
    public void shutOff() {
        if (isOn == true){
            isOn = false;
            System.out.println("Vehicle is switched off");
            speed = 0;
        }else{
            System.out.println("Vehicle is already switched off");
        }
    }

    // Static methods
    public static void setVIN(String newVin) { 
        vin = newVin; 
    }

    public void resetVID(){
        setVID();
    }

    private void setVID(){
        VID = vin + vehicleCount;
    }

    public double getSpeed(){
        return speed;
    }

    public void setSpeed(double s){
        if (isOn == true){
            speed = s;
            System.out.println("The speed " + s + " is set ");
        }else{
            System.out.println("The speed cannot be set as the vehicle is switched off");
        }
    }

    public void showVehicleStatus(){
        System.out.println("\tVehicle ID is : " + VID);
        
        if (isOn == true){
            System.out.println("\tVehicle is switched on");
        }else{
            System.out.println("\tVehicle is switched on");
        }
        
        if (speed > 0){
            System.out.println("\tThe vehicle is running");
        }else{
            System.out.println("\tThe vehicle is not running");
        }

        System.out.println("\tVehicle speed is : " + speed);
    }
}

class Car extends Vehicle{
    private int noOfWheels;
    private int seatingCapacity;
    Car(){
        super();
        noOfWheels = 4;
        seatingCapacity = 5;
    }
    public void showVehicleStatus(){
        System.out.println("It is a CAR");
        super.showVehicleStatus();
        System.out.println("Number of wheels: " + noOfWheels);
        System.out.println("Seating capacity in persons: " + seatingCapacity);
    }
}

class Truck extends Vehicle{
    private int noOfWheels;
    private double loadingCapacity;
    Truck(){
        super();
        noOfWheels = 6;
        loadingCapacity = 100;
    }

    Truck(boolean onOff, double spd, int wheels, double capacity){
        super(onOff,spd);
        this.noOfWheels = wheels;
        this.loadingCapacity = capacity;
    }

    public void showVehicleStatus(){
        System.out.println("It is a Truck");
        super.showVehicleStatus();
        System.out.println("Number of wheels: " + noOfWheels);
        System.out.println("Loading capacity in KGs: " + loadingCapacity);
    }
}

public class InterfaceExample{
    public static void main(String[] args){
 
        Vehicle v = new Vehicle(true, 40.0);
        System.out.println("\t\tVehicle status at the beginning: ");
        v.showVehicleStatus();

        v.startUp();
        v.setSpeed(10.0);
        System.out.println("\t\tVehicle status at after modification: ");
        v.showVehicleStatus();

        Car c1 = new Car();
        c1.showVehicleStatus();

        Truck t1 = new Truck();
        t1.showVehicleStatus();

        Truck t2 = new Truck(true, 30.0, 10, 150.0);
        t2.showVehicleStatus();
    }
}