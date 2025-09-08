public class Clothes {
    private String brand;
    private String type;     // e.g., T-shirt, Jacket, Pants, Dress
    private String color;
    private String size;     // e.g., Small, Medium, Large, XL
    private String material;
    private double price;
    private String gender;   // e.g., Male, Female, Unisex
    private int year;

    // No-argument constructor
    public Clothes() {
        this.brand = "No Brand";
        this.type = "No Type";
        this.color = "No Color";
        this.size = "No Size";
        this.material = "No Material";
        this.price = 0.0;
        this.gender = "Unspecified";
        this.year = 0;
    }

    // Parameterized constructor
    public Clothes(String brand, String type, String color, String size, 
                   String material, double price, String gender, int year) {
        this.brand = brand;
        this.type = type;
        this.color = color;
        this.size = size;
        this.material = material;
        this.price = price;
        this.gender = gender;
        this.year = (year > 0 && year <= java.time.Year.now().getValue()) ? year : 0; // Validate year
    }

    // Method to display clothes information
    public String displayInfo() {
        String info = "";
        info += "Clothes Brand: " + brand + "\n";
        info += "Clothes Type: " + type + "\n";
        info += "Clothes Color: " + color + "\n";
        info += "Clothes Size: " + size + "\n";
        info += "Clothes Material: " + material + "\n";
        info += "Clothes Price: $" + price + "\n";
        info += "Clothes Gender: " + gender + "\n";
        info += "Clothes Year: " + year + "\n";
        System.out.println(info);
        return info;
    }
}