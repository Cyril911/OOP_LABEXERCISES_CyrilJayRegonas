/**
 * Subclass of Book for reference books
 */
public class Reference extends Book {
    private String edition;
    private String updated;
    
    // Default constructor
    public Reference() {
        super();
        this.edition = "Unknown";
        this.updated = "Unknown";
    }
    
    // Parameterized constructor
    public Reference(String itemId, String title, String author, int publicationYear, 
                    String isbn, int pages, String genre, String edition, String updated) {
        super(itemId, title, author, publicationYear, isbn, pages, genre);
        this.edition = edition;
        this.updated = updated;
    }
    
    // Getters and setters
    public String getEdition() { return edition; }
    public void setEdition(String edition) { this.edition = edition; }
    
    public String getUpdated() { return updated; }
    public void setUpdated(String updated) { this.updated = updated; }
    
    // Reference specific methods
    public void lookup() {
        System.out.println("Looking up information in " + title + " (" + edition + " edition)");
    }
    
    public void cite() {
        System.out.println("Citing reference: " + title + ", " + edition + " edition");
    }
    
    @Override
    public String toString() {
        return "Reference [edition=" + edition + ", updated=" + updated + 
               ", " + super.toString() + "]";
    }
}
