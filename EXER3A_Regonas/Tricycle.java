/**
 * Subclass of LandTransport for tricycles
 */
public class Tricycle extends LandTransport {
    private boolean sidecar;
    private String color;
    private String engine;
    
    // Default constructor
    public Tricycle() {
        super();
        this.sidecar = false;
        this.color = "Unknown";
        this.engine = "Unknown";
    }
    
    // Parameterized constructor
    public Tricycle(String engine, int wheels, String steeringWheel, int capacity, 
                   double speed, int numberOfWheels, String fuelType, 
                   boolean sidecar, String color) {
        super(engine, wheels, steeringWheel, capacity, speed, numberOfWheels, fuelType);
        this.sidecar = sidecar;
        this.color = color;
        this.engine = engine;
    }
    
    // Getters and setters
    public boolean hasSidecar() { return sidecar; }
    public void setSidecar(boolean sidecar) { this.sidecar = sidecar; }
    
    public String getColor() { return color; }
    public void setColor(String color) { this.color = color; }
    
    public String getEngine() { return engine; }
    public void setEngine(String engine) { this.engine = engine; }
    
    // Tricycle specific methods
    public void startEngine() {
        System.out.println("Starting tricycle engine...");
    }
    
    public void honk() {
        System.out.println("Tricycle honking...");
    }
    
    @Override
    public String toString() {
        return "Tricycle [sidecar=" + sidecar + ", color=" + color + 
               ", engine=" + engine + ", " + super.toString() + "]";
    }
}
