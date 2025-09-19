/**
 * Subclass of AirTransport for drones
 */
public class Drone extends AirTransport {
    private double batteryLife;
    private double maxAltitude;
    private String cameraType;
    
    // Default constructor
    public Drone() {
        super();
        this.batteryLife = 0.0;
        this.maxAltitude = 0.0;
        this.cameraType = "Unknown";
    }
    
    // Parameterized constructor
    public Drone(String engine, int wheels, String steeringWheel, int capacity, 
                double speed, String fuelType, double wingspan,
                double batteryLife, double maxAltitude, String cameraType) {
        super(engine, wheels, steeringWheel, capacity, speed, fuelType, wingspan);
        this.batteryLife = batteryLife;
        this.maxAltitude = maxAltitude;
        this.cameraType = cameraType;
    }
    
    // Getters and setters
    public double getBatteryLife() { return batteryLife; }
    public void setBatteryLife(double batteryLife) { this.batteryLife = batteryLife; }
    
    public double getMaxAltitude() { return maxAltitude; }
    public void setMaxAltitude(double maxAltitude) { this.maxAltitude = maxAltitude; }
    
    public String getCameraType() { return cameraType; }
    public void setCameraType(String cameraType) { this.cameraType = cameraType; }
    
    // Drone specific methods
    public void takePhoto() {
        System.out.println("Taking photo with " + cameraType + " camera...");
    }
    
    public void recordVideo() {
        System.out.println("Recording video with drone...");
    }
    
    @Override
    public String toString() {
        return "Drone [batteryLife=" + batteryLife + ", maxAltitude=" + maxAltitude + 
               ", cameraType=" + cameraType + ", " + super.toString() + "]";
    }
}
