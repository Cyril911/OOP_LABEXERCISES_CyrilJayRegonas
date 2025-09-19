/**
 * Subclass of Transportation for water-based vehicles
 */
public class WaterTransport extends Transportation {
    protected double displacement;
    protected double maxRange;
    
    // Default constructor
    public WaterTransport() {
        super();
        this.displacement = 0.0;
        this.maxRange = 0.0;
    }
    
    // Parameterized constructor
    public WaterTransport(String engine, int wheels, String steeringWheel, int capacity, 
                         double speed, double displacement, double maxRange) {
        super(engine, wheels, steeringWheel, capacity, speed);
        this.displacement = displacement;
        this.maxRange = maxRange;
    }
    
    // Getters and setters
    public double getDisplacement() { return displacement; }
    public void setDisplacement(double displacement) { this.displacement = displacement; }
    
    public double getMaxRange() { return maxRange; }
    public void setMaxRange(double maxRange) { this.maxRange = maxRange; }
    
    // Water transport specific methods
    public void sail() {
        System.out.println("Sailing on water...");
    }
    
    public void dock() {
        System.out.println("Docking at port...");
    }
    
    @Override
    public String toString() {
        return "WaterTransport [displacement=" + displacement + ", maxRange=" + maxRange + 
               ", " + super.toString() + "]";
    }
}
