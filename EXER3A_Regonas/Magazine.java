/**
 * Subclass of LibraryItem for magazines
 */
public class Magazine extends LibraryItem {
    protected String issue;
    protected String volume;
    protected String publisher;
    
    // Default constructor
    public Magazine() {
        super();
        this.issue = "Unknown";
        this.volume = "Unknown";
        this.publisher = "Unknown";
    }
    
    // Parameterized constructor
    public Magazine(String itemId, String title, String author, int publicationYear, 
                   String issue, String volume, String publisher) {
        super(itemId, title, author, publicationYear);
        this.issue = issue;
        this.volume = volume;
        this.publisher = publisher;
    }
    
    // Getters and setters
    public String getIssue() { return issue; }
    public void setIssue(String issue) { this.issue = issue; }
    
    public String getVolume() { return volume; }
    public void setVolume(String volume) { this.volume = volume; }
    
    public String getPublisher() { return publisher; }
    public void setPublisher(String publisher) { this.publisher = publisher; }
    
    // Magazine specific methods
    public void browse() {
        System.out.println("Browsing magazine: " + title + " Issue " + issue);
    }
    
    public void subscribe() {
        System.out.println("Subscribing to " + publisher + " magazine");
    }
    
    @Override
    public String toString() {
        return "Magazine [issue=" + issue + ", volume=" + volume + 
               ", publisher=" + publisher + ", " + super.toString() + "]";
    }
}
