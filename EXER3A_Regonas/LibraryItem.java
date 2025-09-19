/**
 * Base class for all library items
 * Contains common attributes shared by all library items
 */
public class LibraryItem {
    protected String itemId;
    protected String title;
    protected String author;
    protected int publicationYear;
    protected boolean available;
    protected String borrowDate;
    
    // Default constructor
    public LibraryItem() {
        this.itemId = "Unknown";
        this.title = "Unknown";
        this.author = "Unknown";
        this.publicationYear = 0;
        this.available = true;
        this.borrowDate = "Not borrowed";
    }
    
    // Parameterized constructor
    public LibraryItem(String itemId, String title, String author, int publicationYear) {
        this.itemId = itemId;
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
        this.available = true;
        this.borrowDate = "Not borrowed";
    }
    
    // Getters and setters
    public String getItemId() { return itemId; }
    public void setItemId(String itemId) { this.itemId = itemId; }
    
    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }
    
    public String getAuthor() { return author; }
    public void setAuthor(String author) { this.author = author; }
    
    public int getPublicationYear() { return publicationYear; }
    public void setPublicationYear(int publicationYear) { this.publicationYear = publicationYear; }
    
    public boolean isAvailable() { return available; }
    public void setAvailable(boolean available) { this.available = available; }
    
    public String getBorrowDate() { return borrowDate; }
    public void setBorrowDate(String borrowDate) { this.borrowDate = borrowDate; }
    
    // Common methods for all library items
    public void borrow() {
        if (available) {
            this.available = false;
            this.borrowDate = java.time.LocalDate.now().toString();
            System.out.println("Item " + itemId + " has been borrowed.");
        } else {
            System.out.println("Item " + itemId + " is not available for borrowing.");
        }
    }
    
    public void returnItem() {
        this.available = true;
        this.borrowDate = "Not borrowed";
        System.out.println("Item " + itemId + " has been returned.");
    }
    
    @Override
    public String toString() {
        return "LibraryItem [itemId=" + itemId + ", title=" + title + 
               ", author=" + author + ", publicationYear=" + publicationYear + 
               ", available=" + available + ", borrowDate=" + borrowDate + "]";
    }
}
