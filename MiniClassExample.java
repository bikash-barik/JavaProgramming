class Vehicle {
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
        isOn = onOff;
        speed = spd;        
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
        System.out.println("Vehicle ID is : " + VID);
        
        if (isOn == true){
            System.out.println("Vehicle is switched on");
        }else{
            System.out.println("Vehicle is switched on");
        }
        
        if (speed > 0){
            System.out.println("The vehicle is running");
        }else{
            System.out.println("The vehicle is not running");
        }

        System.out.println("Vehicle speed is : " + speed);
    }
}

public class MiniClassExample{
    public static void main(String[] args){
        Vehicle v1 = new Vehicle(); // construct an object
        v1.showVehicleStatus();
        Vehicle.setVIN(new String("VID"));
        v1.resetVID();
        v1.showVehicleStatus();
        v1.setSpeed(10.0);
        v1.showVehicleStatus();

        Vehicle v2 = new Vehicle();
        v2.startUp();
        v2.setSpeed(10.0);
        v2.showVehicleStatus();

        Vehicle v3 = new Vehicle(true, 40.0);
        v3.showVehicleStatus();
    }
}