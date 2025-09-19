/**
 * Subclass of LandTransport for motorcycles
 */
public class Motorcycle extends LandTransport {
    private String engine;
    private String brand;
    private String color;
    
    // Default constructor
    public Motorcycle() {
        super();
        this.engine = "Unknown";
        this.brand = "Unknown";
        this.color = "Unknown";
    }
    
    // Parameterized constructor
    public Motorcycle(String engine, int wheels, String steeringWheel, int capacity, 
                     double speed, int numberOfWheels, String fuelType, 
                     String brand, String color) {
        super(engine, wheels, steeringWheel, capacity, speed, numberOfWheels, fuelType);
        this.engine = engine;
        this.brand = brand;
        this.color = color;
    }
    
    // Getters and setters
    public String getEngine() { return engine; }
    public void setEngine(String engine) { this.engine = engine; }
    
    public String getBrand() { return brand; }
    public void setBrand(String brand) { this.brand = brand; }
    
    public String getColor() { return color; }
    public void setColor(String color) { this.color = color; }
    
    // Motorcycle specific methods
    public void revEngine() {
        System.out.println("Revving motorcycle engine...");
    }
    
    public void wheelie() {
        System.out.println("Performing a wheelie...");
    }
    
    @Override
    public String toString() {
        return "Motorcycle [engine=" + engine + ", brand=" + brand + 
               ", color=" + color + ", " + super.toString() + "]";
    }
}
