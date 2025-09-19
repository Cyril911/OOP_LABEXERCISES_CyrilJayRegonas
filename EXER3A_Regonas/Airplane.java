/**
 * Subclass of AirTransport for airplanes
 */
public class Airplane extends AirTransport {
    private String airline;
    private int numberOfEngines;
    private double flightRange;
    
    // Default constructor
    public Airplane() {
        super();
        this.airline = "Unknown";
        this.numberOfEngines = 0;
        this.flightRange = 0.0;
    }
    
    // Parameterized constructor
    public Airplane(String engine, int wheels, String steeringWheel, int capacity, 
                   double speed, String fuelType, double wingspan,
                   String airline, int numberOfEngines, double flightRange) {
        super(engine, wheels, steeringWheel, capacity, speed, fuelType, wingspan);
        this.airline = airline;
        this.numberOfEngines = numberOfEngines;
        this.flightRange = flightRange;
    }
    
    // Getters and setters
    public String getAirline() { return airline; }
    public void setAirline(String airline) { this.airline = airline; }
    
    public int getNumberOfEngines() { return numberOfEngines; }
    public void setNumberOfEngines(int numberOfEngines) { this.numberOfEngines = numberOfEngines; }
    
    public double getFlightRange() { return flightRange; }
    public void setFlightRange(double flightRange) { this.flightRange = flightRange; }
    
    // Airplane specific methods
    public void boardPassengers() {
        System.out.println("Boarding passengers onto airplane...");
    }
    
    public void serveMeals() {
        System.out.println("Serving meals to passengers...");
    }
    
    @Override
    public String toString() {
        return "Airplane [airline=" + airline + ", numberOfEngines=" + numberOfEngines + 
               ", flightRange=" + flightRange + ", " + super.toString() + "]";
    }
}
