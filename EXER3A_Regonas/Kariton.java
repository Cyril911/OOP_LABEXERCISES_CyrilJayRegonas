/**
 * Subclass of LandTransport for kariton (cart)
 */
public class Kariton extends LandTransport {
    private String pulledBy;
    private String material;
    
    // Default constructor
    public Kariton() {
        super();
        this.pulledBy = "Unknown";
        this.material = "Unknown";
    }
    
    // Parameterized constructor
    public Kariton(String engine, int wheels, String steeringWheel, int capacity, 
                  double speed, int numberOfWheels, String fuelType, 
                  String pulledBy, String material) {
        super(engine, wheels, steeringWheel, capacity, speed, numberOfWheels, fuelType);
        this.pulledBy = pulledBy;
        this.material = material;
    }
    
    // Getters and setters
    public String getPulledBy() { return pulledBy; }
    public void setPulledBy(String pulledBy) { this.pulledBy = pulledBy; }
    
    public String getMaterial() { return material; }
    public void setMaterial(String material) { this.material = material; }
    
    // Kariton specific methods
    public void loadGoods() {
        System.out.println("Loading goods into kariton...");
    }
    
    public void unloadGoods() {
        System.out.println("Unloading goods from kariton...");
    }
    
    @Override
    public String toString() {
        return "Kariton [pulledBy=" + pulledBy + ", material=" + material + 
               ", " + super.toString() + "]";
    }
}
