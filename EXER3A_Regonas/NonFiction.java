/**
 * Subclass of Book for non-fiction books
 */
public class NonFiction extends Book {
    private String subject;
    private String level;
    
    // Default constructor
    public NonFiction() {
        super();
        this.subject = "Unknown";
        this.level = "Unknown";
    }
    
    // Parameterized constructor
    public NonFiction(String itemId, String title, String author, int publicationYear, 
                     String isbn, int pages, String genre, String subject, String level) {
        super(itemId, title, author, publicationYear, isbn, pages, genre);
        this.subject = subject;
        this.level = level;
    }
    
    // Getters and setters
    public String getSubject() { return subject; }
    public void setSubject(String subject) { this.subject = subject; }
    
    public String getLevel() { return level; }
    public void setLevel(String level) { this.level = level; }
    
    // Non-fiction specific methods
    public void study() {
        System.out.println("Studying " + subject + " from " + title);
    }
    
    public void research() {
        System.out.println("Using " + title + " for research on " + subject);
    }
    
    @Override
    public String toString() {
        return "NonFiction [subject=" + subject + ", level=" + level + 
               ", " + super.toString() + "]";
    }
}
