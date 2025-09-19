/**
 * Subclass of WaterTransport for submarines
 */
public class Submarine extends WaterTransport {
    private double maxDepth;
    private int crewSize;
    private boolean nuclearPower;
    
    // Default constructor
    public Submarine() {
        super();
        this.maxDepth = 0.0;
        this.crewSize = 0;
        this.nuclearPower = false;
    }
    
    // Parameterized constructor
    public Submarine(String engine, int wheels, String steeringWheel, int capacity, 
                    double speed, double displacement, double maxRange,
                    double maxDepth, int crewSize, boolean nuclearPower) {
        super(engine, wheels, steeringWheel, capacity, speed, displacement, maxRange);
        this.maxDepth = maxDepth;
        this.crewSize = crewSize;
        this.nuclearPower = nuclearPower;
    }
    
    // Getters and setters
    public double getMaxDepth() { return maxDepth; }
    public void setMaxDepth(double maxDepth) { this.maxDepth = maxDepth; }
    
    public int getCrewSize() { return crewSize; }
    public void setCrewSize(int crewSize) { this.crewSize = crewSize; }
    
    public boolean isNuclearPower() { return nuclearPower; }
    public void setNuclearPower(boolean nuclearPower) { this.nuclearPower = nuclearPower; }
    
    // Submarine specific methods
    public void dive() {
        System.out.println("Diving to depth...");
    }
    
    public void surface() {
        System.out.println("Surfacing from depth...");
    }
    
    @Override
    public String toString() {
        return "Submarine [maxDepth=" + maxDepth + ", crewSize=" + crewSize + 
               ", nuclearPower=" + nuclearPower + ", " + super.toString() + "]";
    }
}
