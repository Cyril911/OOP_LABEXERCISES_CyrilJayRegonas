/**
 * Subclass of Book for fiction books
 */
public class Fiction extends Book {
    private String series;
    private String rating;
    
    // Default constructor
    public Fiction() {
        super();
        this.series = "Unknown";
        this.rating = "Unknown";
    }
    
    // Parameterized constructor
    public Fiction(String itemId, String title, String author, int publicationYear, 
                  String isbn, int pages, String genre, String series, String rating) {
        super(itemId, title, author, publicationYear, isbn, pages, genre);
        this.series = series;
        this.rating = rating;
    }
    
    // Getters and setters
    public String getSeries() { return series; }
    public void setSeries(String series) { this.series = series; }
    
    public String getRating() { return rating; }
    public void setRating(String rating) { this.rating = rating; }
    
    // Fiction specific methods
    public void imagine() {
        System.out.println("Imagining the fictional world of " + title);
    }
    
    public void recommend() {
        System.out.println("Recommending fiction book: " + title + " (Rating: " + rating + ")");
    }
    
    @Override
    public String toString() {
        return "Fiction [series=" + series + ", rating=" + rating + 
               ", " + super.toString() + "]";
    }
}
