/**
 * Subclass of WaterTransport for yachts
 */
public class Yacht extends WaterTransport {
    private int crewSize;
    private boolean sail;
    private String luxuryLevel;
    
    // Default constructor
    public Yacht() {
        super();
        this.crewSize = 0;
        this.sail = false;
        this.luxuryLevel = "Unknown";
    }
    
    // Parameterized constructor
    public Yacht(String engine, int wheels, String steeringWheel, int capacity, 
                double speed, double displacement, double maxRange,
                int crewSize, boolean sail, String luxuryLevel) {
        super(engine, wheels, steeringWheel, capacity, speed, displacement, maxRange);
        this.crewSize = crewSize;
        this.sail = sail;
        this.luxuryLevel = luxuryLevel;
    }
    
    // Getters and setters
    public int getCrewSize() { return crewSize; }
    public void setCrewSize(int crewSize) { this.crewSize = crewSize; }
    
    public boolean hasSail() { return sail; }
    public void setSail(boolean sail) { this.sail = sail; }
    
    public String getLuxuryLevel() { return luxuryLevel; }
    public void setLuxuryLevel(String luxuryLevel) { this.luxuryLevel = luxuryLevel; }
    
    // Yacht specific methods
    public void party() {
        System.out.println("Hosting a party on the yacht...");
    }
    
    public void anchor() {
        System.out.println("Anchoring the yacht...");
    }
    
    @Override
    public String toString() {
        return "Yacht [crewSize=" + crewSize + ", sail=" + sail + 
               ", luxuryLevel=" + luxuryLevel + ", " + super.toString() + "]";
    }
}
