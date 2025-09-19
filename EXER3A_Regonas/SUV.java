/**
 * Subclass of LandTransport for SUVs
 */
public class SUV extends LandTransport {
    private String brand;
    private String model;
    private boolean fourWheelDrive;
    
    // Default constructor
    public SUV() {
        super();
        this.brand = "Unknown";
        this.model = "Unknown";
        this.fourWheelDrive = false;
    }
    
    // Parameterized constructor
    public SUV(String engine, int wheels, String steeringWheel, int capacity, 
              double speed, int numberOfWheels, String fuelType, 
              String brand, String model, boolean fourWheelDrive) {
        super(engine, wheels, steeringWheel, capacity, speed, numberOfWheels, fuelType);
        this.brand = brand;
        this.model = model;
        this.fourWheelDrive = fourWheelDrive;
    }
    
    // Getters and setters
    public String getBrand() { return brand; }
    public void setBrand(String brand) { this.brand = brand; }
    
    public String getModel() { return model; }
    public void setModel(String model) { this.model = model; }
    
    public boolean isFourWheelDrive() { return fourWheelDrive; }
    public void setFourWheelDrive(boolean fourWheelDrive) { this.fourWheelDrive = fourWheelDrive; }
    
    // SUV specific methods
    public void engageFourWheelDrive() {
        if (fourWheelDrive) {
            System.out.println("Engaging four-wheel drive...");
        } else {
            System.out.println("This SUV doesn't have four-wheel drive capability.");
        }
    }
    
    public void offRoad() {
        System.out.println("Driving off-road with SUV...");
    }
    
    @Override
    public String toString() {
        return "SUV [brand=" + brand + ", model=" + model + 
               ", fourWheelDrive=" + fourWheelDrive + ", " + super.toString() + "]";
    }
}
