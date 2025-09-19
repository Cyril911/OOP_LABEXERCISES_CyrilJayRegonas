/**
 * Subclass of AirTransport for helicopters
 */
public class Helicopter extends AirTransport {
    private String rotorPropeller;
    private double bladeLength;
    
    // Default constructor
    public Helicopter() {
        super();
        this.rotorPropeller = "Unknown";
        this.bladeLength = 0.0;
    }
    
    // Parameterized constructor
    public Helicopter(String engine, int wheels, String steeringWheel, int capacity, 
                     double speed, String fuelType, double wingspan,
                     String rotorPropeller, double bladeLength) {
        super(engine, wheels, steeringWheel, capacity, speed, fuelType, wingspan);
        this.rotorPropeller = rotorPropeller;
        this.bladeLength = bladeLength;
    }
    
    // Getters and setters
    public String getRotorPropeller() { return rotorPropeller; }
    public void setRotorPropeller(String rotorPropeller) { this.rotorPropeller = rotorPropeller; }
    
    public double getBladeLength() { return bladeLength; }
    public void setBladeLength(double bladeLength) { this.bladeLength = bladeLength; }
    
    // Helicopter specific methods
    public void hover() {
        System.out.println("Helicopter hovering in place...");
    }
    
    public void rescue() {
        System.out.println("Performing rescue operation...");
    }
    
    @Override
    public String toString() {
        return "Helicopter [rotorPropeller=" + rotorPropeller + ", bladeLength=" + bladeLength + 
               ", " + super.toString() + "]";
    }
}
