/**
 * TransportationTester class to demonstrate inheritance
 * Creates instances of each subclass and demonstrates their functionality
 */
public class TransportationTester {
    public static void main(String[] args) {
        System.out.println("=== TRANSPORTATION SYSTEM TESTER ===\n");
        
        // Create instances of each subclass
        System.out.println("1. LAND TRANSPORTATION:");
        System.out.println("========================");
        
        // Truck instance
        Truck truck = new Truck("Diesel V8", 6, "Steering Wheel", 2, 120.0, 6, "Diesel", 
                               5000.0, "Ford", "F-150");
        System.out.println("Truck: " + truck);
        truck.start();
        truck.loadCargo();
        truck.accelerate();
        truck.unloadCargo();
        truck.stop();
        System.out.println();
        
        // SUV instance
        SUV suv = new SUV("Gasoline V6", 4, "Steering Wheel", 7, 150.0, 4, "Gasoline", 
                         "Toyota", "RAV4", true);
        System.out.println("SUV: " + suv);
        suv.start();
        suv.engageFourWheelDrive();
        suv.offRoad();
        suv.brake();
        suv.stop();
        System.out.println();
        
        // Tricycle instance
        Tricycle tricycle = new Tricycle("150cc", 3, "Handlebar", 2, 60.0, 3, "Gasoline", 
                                        true, "Red");
        System.out.println("Tricycle: " + tricycle);
        tricycle.start();
        tricycle.startEngine();
        tricycle.honk();
        tricycle.brake();
        tricycle.stop();
        System.out.println();
        
        // Motorcycle instance
        Motorcycle motorcycle = new Motorcycle("600cc", 2, "Handlebar", 2, 200.0, 2, "Gasoline", 
                                              "Honda", "CBR600");
        System.out.println("Motorcycle: " + motorcycle);
        motorcycle.start();
        motorcycle.revEngine();
        motorcycle.wheelie();
        motorcycle.brake();
        motorcycle.stop();
        System.out.println();
        
        // Kariton instance
        Kariton kariton = new Kariton("None", 4, "None", 1, 5.0, 4, "Manual", 
                                     "Person", "Wood");
        System.out.println("Kariton: " + kariton);
        kariton.start();
        kariton.loadGoods();
        kariton.accelerate();
        kariton.unloadGoods();
        kariton.stop();
        System.out.println();
        
        System.out.println("2. AIR TRANSPORTATION:");
        System.out.println("======================");
        
        // Airplane instance
        Airplane airplane = new Airplane("Jet Engine", 3, "Yoke", 200, 800.0, "Jet Fuel", 
                                        35.0, "Philippine Airlines", 2, 5000.0);
        System.out.println("Airplane: " + airplane);
        airplane.start();
        airplane.takeOff();
        airplane.boardPassengers();
        airplane.serveMeals();
        airplane.land();
        airplane.stop();
        System.out.println();
        
        // Helicopter instance
        Helicopter helicopter = new Helicopter("Turboshaft", 3, "Cyclic Stick", 8, 250.0, 
                                             "Jet Fuel", 15.0, "Main Rotor", 7.5);
        System.out.println("Helicopter: " + helicopter);
        helicopter.start();
        helicopter.takeOff();
        helicopter.hover();
        helicopter.rescue();
        helicopter.land();
        helicopter.stop();
        System.out.println();
        
        // Drone instance
        Drone drone = new Drone("Electric Motor", 4, "Remote Control", 0, 50.0, 
                               "Battery", 1.0, 30.0, 500.0, "4K Camera");
        System.out.println("Drone: " + drone);
        drone.start();
        drone.takeOff();
        drone.takePhoto();
        drone.recordVideo();
        drone.land();
        drone.stop();
        System.out.println();
        
        System.out.println("3. WATER TRANSPORTATION:");
        System.out.println("========================");
        
        // Yacht instance
        Yacht yacht = new Yacht("Diesel Engine", 0, "Wheel", 12, 30.0, 50.0, 1000.0, 
                               5, true, "Luxury");
        System.out.println("Yacht: " + yacht);
        yacht.start();
        yacht.sail();
        yacht.party();
        yacht.anchor();
        yacht.dock();
        yacht.stop();
        System.out.println();
        
        // Submarine instance
        Submarine submarine = new Submarine("Nuclear Reactor", 0, "Control Stick", 150, 
                                          40.0, 8000.0, 20000.0, 300.0, 120, true);
        System.out.println("Submarine: " + submarine);
        submarine.start();
        submarine.sail();
        submarine.dive();
        submarine.surface();
        submarine.dock();
        submarine.stop();
        System.out.println();
        
        System.out.println("=== TESTING COMPLETED ===");
    }
}
