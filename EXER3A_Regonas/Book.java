/**
 * Subclass of LibraryItem for books
 */
public class Book extends LibraryItem {
    protected String isbn;
    protected int pages;
    protected String genre;
    
    // Default constructor
    public Book() {
        super();
        this.isbn = "Unknown";
        this.pages = 0;
        this.genre = "Unknown";
    }
    
    // Parameterized constructor
    public Book(String itemId, String title, String author, int publicationYear, 
               String isbn, int pages, String genre) {
        super(itemId, title, author, publicationYear);
        this.isbn = isbn;
        this.pages = pages;
        this.genre = genre;
    }
    
    // Getters and setters
    public String getIsbn() { return isbn; }
    public void setIsbn(String isbn) { this.isbn = isbn; }
    
    public int getPages() { return pages; }
    public void setPages(int pages) { this.pages = pages; }
    
    public String getGenre() { return genre; }
    public void setGenre(String genre) { this.genre = genre; }
    
    // Book specific methods
    public void read() {
        System.out.println("Reading book: " + title);
    }
    
    public void bookmark(int page) {
        System.out.println("Bookmarked page " + page + " in " + title);
    }
    
    @Override
    public String toString() {
        return "Book [isbn=" + isbn + ", pages=" + pages + ", genre=" + genre + 
               ", " + super.toString() + "]";
    }
}
