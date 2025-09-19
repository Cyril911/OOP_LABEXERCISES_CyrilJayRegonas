/**
 * Subclass of Transportation for land-based vehicles
 */
public class LandTransport extends Transportation {
    protected int numberOfWheels;
    protected String engine;
    protected String fuelType;
    
    // Default constructor
    public LandTransport() {
        super();
        this.numberOfWheels = 0;
        this.engine = "Unknown";
        this.fuelType = "Unknown";
    }
    
    // Parameterized constructor
    public LandTransport(String engine, int wheels, String steeringWheel, int capacity, 
                        double speed, int numberOfWheels, String fuelType) {
        super(engine, wheels, steeringWheel, capacity, speed);
        this.numberOfWheels = numberOfWheels;
        this.engine = engine;
        this.fuelType = fuelType;
    }
    
    // Getters and setters
    public int getNumberOfWheels() { return numberOfWheels; }
    public void setNumberOfWheels(int numberOfWheels) { this.numberOfWheels = numberOfWheels; }
    
    public String getFuelType() { return fuelType; }
    public void setFuelType(String fuelType) { this.fuelType = fuelType; }
    
    // Land transport specific methods
    public void accelerate() {
        System.out.println("Accelerating on land...");
    }
    
    public void brake() {
        System.out.println("Applying brakes...");
    }
    
    @Override
    public String toString() {
        return "LandTransport [numberOfWheels=" + numberOfWheels + ", engine=" + engine + 
               ", fuelType=" + fuelType + ", " + super.toString() + "]";
    }
}
