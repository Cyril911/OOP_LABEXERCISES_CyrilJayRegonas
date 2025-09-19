/**
 * Subclass of LandTransport for trucks
 */
public class Truck extends LandTransport {
    private double loadCapacity;
    private String brand;
    private String model;
    
    // Default constructor
    public Truck() {
        super();
        this.loadCapacity = 0.0;
        this.brand = "Unknown";
        this.model = "Unknown";
    }
    
    // Parameterized constructor
    public Truck(String engine, int wheels, String steeringWheel, int capacity, 
                double speed, int numberOfWheels, String fuelType, 
                double loadCapacity, String brand, String model) {
        super(engine, wheels, steeringWheel, capacity, speed, numberOfWheels, fuelType);
        this.loadCapacity = loadCapacity;
        this.brand = brand;
        this.model = model;
    }
    
    // Getters and setters
    public double getLoadCapacity() { return loadCapacity; }
    public void setLoadCapacity(double loadCapacity) { this.loadCapacity = loadCapacity; }
    
    public String getBrand() { return brand; }
    public void setBrand(String brand) { this.brand = brand; }
    
    public String getModel() { return model; }
    public void setModel(String model) { this.model = model; }
    
    // Truck specific methods
    public void loadCargo() {
        System.out.println("Loading cargo into truck...");
    }
    
    public void unloadCargo() {
        System.out.println("Unloading cargo from truck...");
    }
    
    @Override
    public String toString() {
        return "Truck [loadCapacity=" + loadCapacity + ", brand=" + brand + 
               ", model=" + model + ", " + super.toString() + "]";
    }
}
