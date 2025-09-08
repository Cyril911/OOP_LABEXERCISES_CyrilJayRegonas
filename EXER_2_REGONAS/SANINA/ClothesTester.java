public class ClothesTester {
    public static void main(String[] args) {
        // Create a Clothes object using the no-argument constructor
        Clothes clothes1 = new Clothes();

        // Create a Clothes object using the parameterized constructor
        Clothes clothes2 = new Clothes("Uniqlo", "Jacket", "Navy Blue", "Medium",
                                       "Cotton Blend", 59.99, "Unisex", 2024);

        Clothes clothes3 = new Clothes("Levi's", "Jeans", "Light Blue", "32",
                                       "Denim", 89.50, "Male", 2023);

        // Display information for the clothes
        System.out.println("Clothes 1 Information:");
        clothes1.displayInfo();

        System.out.println("Clothes 2 Information:");
        clothes2.displayInfo();

        System.out.println("Clothes 3 Information:");
        clothes3.displayInfo();
    }
}
