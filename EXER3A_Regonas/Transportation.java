/**
 * Base class for all transportation vehicles
 * Contains common attributes shared by all transportation types
 */
public class Transportation {
    protected String engine;
    protected int wheels;
    protected String steeringWheel;
    protected int capacity;
    protected double speed;
    
    // Default constructor
    public Transportation() {
        this.engine = "Unknown";
        this.wheels = 0;
        this.steeringWheel = "Unknown";
        this.capacity = 0;
        this.speed = 0.0;
    }
    
    // Parameterized constructor
    public Transportation(String engine, int wheels, String steeringWheel, int capacity, double speed) {
        this.engine = engine;
        this.wheels = wheels;
        this.steeringWheel = steeringWheel;
        this.capacity = capacity;
        this.speed = speed;
    }
    
    // Getters and setters
    public String getEngine() { return engine; }
    public void setEngine(String engine) { this.engine = engine; }
    
    public int getWheels() { return wheels; }
    public void setWheels(int wheels) { this.wheels = wheels; }
    
    public String getSteeringWheel() { return steeringWheel; }
    public void setSteeringWheel(String steeringWheel) { this.steeringWheel = steeringWheel; }
    
    public int getCapacity() { return capacity; }
    public void setCapacity(int capacity) { this.capacity = capacity; }
    
    public double getSpeed() { return speed; }
    public void setSpeed(double speed) { this.speed = speed; }
    
    // Common method for all transportation
    public void start() {
        System.out.println("Starting transportation vehicle...");
    }
    
    public void stop() {
        System.out.println("Stopping transportation vehicle...");
    }
    
    @Override
    public String toString() {
        return "Transportation [engine=" + engine + ", wheels=" + wheels + 
               ", steeringWheel=" + steeringWheel + ", capacity=" + capacity + 
               ", speed=" + speed + "]";
    }
}
