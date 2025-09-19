/**
 * Subclass of Transportation for air-based vehicles
 */
public class AirTransport extends Transportation {
    protected String fuelType;
    protected double wingspan;
    
    // Default constructor
    public AirTransport() {
        super();
        this.fuelType = "Unknown";
        this.wingspan = 0.0;
    }
    
    // Parameterized constructor
    public AirTransport(String engine, int wheels, String steeringWheel, int capacity, 
                       double speed, String fuelType, double wingspan) {
        super(engine, wheels, steeringWheel, capacity, speed);
        this.fuelType = fuelType;
        this.wingspan = wingspan;
    }
    
    // Getters and setters
    public String getFuelType() { return fuelType; }
    public void setFuelType(String fuelType) { this.fuelType = fuelType; }
    
    public double getWingspan() { return wingspan; }
    public void setWingspan(double wingspan) { this.wingspan = wingspan; }
    
    // Air transport specific methods
    public void takeOff() {
        System.out.println("Taking off...");
    }
    
    public void land() {
        System.out.println("Landing...");
    }
    
    @Override
    public String toString() {
        return "AirTransport [fuelType=" + fuelType + ", wingspan=" + wingspan + 
               ", " + super.toString() + "]";
    }
}
